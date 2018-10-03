-- --------------------------------------------------------
-- local:                           127.0.0.1
-- MySQL Version:                   8.0.12 - MySQL Community Server - GPL
-- OS:                      		Win64
-- HeidiSQL Version:                9.5.0.5196
-- Author:							Yunwei Jiang
-- --------------------------------------------------------
-- For general UserAccount Table shared by Buyer/Seller
create table UserAccount
(
	UserID varchar(50),
	Email varchar(100),
	AccountType int,
	UserPassword varchar(100),
	University varchar(100),
	FirstName varchar(50),
	LastName varchar(50),
	UserCity varchar(100),
	UserState varchar(20),
	UserCountry  varchar(20),
	UserAddress1 varchar(100),
	UserAddress2 varchar(100),
	UserPhone varchar(20),
	UserRegistrationDate timestamp,
	UserEmailVerified tinyint(1) default 0,
	UserZip varchar(20),
	primary key (UserID)
);
-- For admin account 
-- Since admin account won't share much common information with buyer and seller
-- So just create a single table 
create table AdminAccount
(
	AdminID varchar(50),
	AdminPassword varchar(100),
	AdminRegistrationDate timestamp,
	primary key (AdminID)
);

-- For Items category table
create table ItemCategories
(
	CategoryID int(11),
	CategoryName varchar(50),
	primary key (CategoryID)
);

-- For Items table
create table Items
(
	ItemID varchar(50),
	SellerID varchar(50),
	ItemName varchar(100),
	ItemPrice float,
	ItemWeight float,
	ItemCartDesc varchar(250),-- For description in buyer cart
	ItemLongDesc varchar(100),-- For description in product page
	ItemCategoryID int,
	ItemImageRef varchar(200),
	ItemNumber int,
	ItemSold tinyint(1) default 0,-- 0 means not sold yet, 1 means all sold out	
	primary key (ItemID),
	foreign key (SellerID) references UserAccount(UserID),
	foreign key (ItemCategoryID) references ItemCategories(CategoryID)
);


-- For Orders table
create table Orders
(
	OrderID varchar(50),
	OrderSellerID varchar(50),
	OrderBuyerID varchar(50),
	OrderAmount int,
	OrderShipAddress1 varchar(100),
	OrderShipAddress2 varchar(100),
	OrderCity varchar(100),
	OrderState varchar(20),
	OrderCountry  varchar(20),
	OrderPhone varchar(20),
	OrderZip varchar(20),
	OrderDate timestamp,
	OrderShipped tinyint(1),
	OrderTrackingNumber varchar(80),
	primary key (OrderID),
	foreign key (OrderSellerID) references UserAccount(UserID),
	foreign key (OrderBuyerID) references UserAccount(UserID)
);
