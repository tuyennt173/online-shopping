CREATE DATABASE MY_ONLINE_SHOP
USE MY_ONLINE_SHOP

CREATE TABLE accounts
(
	user_name varchar(50) not null,
	password varchar(50) not null,
	full_name nvarchar(50) not null,
	emaill varchar(50) not null,
	photo varchar(50),
	primary key (user_name),
);

CREATE TABLE authorities
(
	id int identity(1,1) not null,
	user_name varchar(50) not null,
	role_id varchar(10) not null,
	primary key (id)
);

CREATE TABLE categories
(
	id char(4) not null,
	name nvarchar(50) not null,
	primary key (id)
);

CREATE TABLE order_details
(
	id bigint identity(1,1) not null,
	order_id bigint not null,
	product_id int not null,
	price float not null,
	quantity int not null,
	primary key (id)
);

CREATE TABLE orders
(
	id bigint identity(1,1) not null,
	user_name varchar(50) not null,
	create_date datetime not null,
	address nvarchar(256) not null,
	primary key (id)
);

CREATE TABLE products
(
	id int identity(1,1) not null,
	name nvarchar(50) not null,
	image nvarchar(50) not null,
	price float not null,
	create_date date not null,
	available bit not null,
	category_id char(4) not null,
	primary key (id)
);

CREATE TABLE roles
(
	id nvarchar(10) not null,
	name nvarchar(50) not null,
	primary key (id)
);

SET IDENTITY_INSERT [dbo].[Products] ON 

INSERT products (id, name, image, price, create_date, available, category_id) VALUES 
(1001, N'Aniseed Syrup', N'1001.jpg', 190, CAST(0xD6070B00 AS Date), 0, N'1000'),
(1002, N'Change', N'1002.jpg', 19, CAST(0xB80B0B00 AS Date), 0, N'1000'),
(1003, N'Aniseed Syrup', N'1003.jpg', 10, CAST(0x26FE0A00 AS Date), 1, N'1001'),
(1004, N'Chef Anton''s Cajun Seasoning', N'1004.jpg', 22, CAST(0x0E020B00 AS Date), 0, N'1001'),
(1005, N'Chef Anton''s Gumbo Mix', N'1005.jpg', 21.35, CAST(0xF7050B00 AS Date), 1, N'1002'),
(1006, N'Grandma''s Boysenberry Spread', N'1006.jpg', 25, CAST(0xE1090B00 AS Date), 0, N'1001'),
(1007, N'Uncle Bob''s Organic Dried Pears', N'1007.jpg', 30, CAST(0x0D0C0B00 AS Date), 0, N'1006'),
(1008, N'Northwoods Cranberry Sauce', N'1008.jpg', 40, CAST(0x4CFC0A00 AS Date), 0, N'1001'),
(1009, N'Mishi Kobe Niku', N'1009.jpg', 97, CAST(0xF80F0B00 AS Date), 0, N'1005'),
(1010, N'Ikura', N'1010.jpg', 31, CAST(0xC91B0B00 AS Date), 0, N'1007'),
(1011, N'Queso Cabrales', N'1011.jpg', 21, CAST(0xEC0F0B00 AS Date), 0, N'1003'),
(1012, N'Queso Manchego La Pastora', N'1012.jpg', 38, CAST(0xD7130B00 AS Date), 1, N'1003'),
(1013, N'Konbu', N'1013.jpg', 6, CAST(0x97270B00 AS Date), 0, N'1007'),
(1014, N'Tofu', N'1014.jpg', 23.25, CAST(0x90270B00 AS Date), 1, N'1006'),
(1015, N'Genen Shouyu', N'1015.jpg', 15.5, CAST(0xAB170B00 AS Date), 0, N'1001'),
(1016, N'Pavlova', N'1016.jpg', 17.45, CAST(0x8B1F0B00 AS Date), 0, N'1002'),
(1017, N'Alice Mutton', N'1017.jpg', 39, CAST(0x602F0B00 AS Date), 1, N'1005'),
(1018, N'Carnarvon Tigers', N'1018.jpg', 62.5, CAST(0x1F340B00 AS Date), 1, N'1007'),
(1019, N'Teatime Chocolate Biscuits', N'1019.jpg', 9.2, CAST(0x4A2B0B00 AS Date), 0, N'1002'),
(1020, N'Sir Rodney''s Marmalade', N'1020.jpg', 81, CAST(0x342F0B00 AS Date), 0, N'1002'),
(1021, N'Sir Rodney''s Scones', N'1021.jpg', 10, CAST(0x1D330B00 AS Date), 0, N'1002'),
(1022, N'Gustaf flower', N'1022.jpg', 21, CAST(0xC0300B00 AS Date), 1, N'1004'),
(1023, N'Tunnbr Korea', N'1023.jpg', 9, CAST(0xAB340B00 AS Date), 1, N'1004'),
(1024, N'Guarana¡ Fanta¡stica', N'1024.jpg', 4.5, CAST(0xB92F0B00 AS Date), 0, N'1000'),
(1025, N'NuNuCa Nuaa-Nougat-Creme', N'1025.jpg', 14, CAST(0x81340B00 AS Date), 0, N'1002'),
(1026, N'Gumbar Gummibarchen', N'1026.jpg', 31.23, CAST(0x49310B00 AS Date), 1, N'1002'),
(1027, N'Schoggi Schokolade', N'1027.jpg', 43.9, CAST(0x112E0B00 AS Date), 0, N'1002'),
(1028, N'Russle Sauerkraut', N'1028.jpg', 45.6, CAST(0xC6330B00 AS Date), 1, N'1006'),
(1029, N'Tharinger Rostbratwurst', N'1029.jpg', 123.79, CAST(0xAE330B00 AS Date), 0, N'1005'),
(1030, N'Nord-Ost Matjeshering', N'1030.jpg', 25.89, CAST(0x3E340B00 AS Date), 0, N'1007'),
(1031, N'Gorgonzola Telino', N'1031.jpg', 12.5, CAST(0x7A330B00 AS Date), 0, N'1003'),
(1032, N'Mascarpone Fabioli', N'1032.jpg', 32, CAST(0x8B340B00 AS Date), 0, N'1003'),
(1033, N'Geitost', N'1033.png', 2.5, CAST(0xC2320B00 AS Date), 0, N'1003'),
(1034, N'Sasquatch Ale', N'1034.jpg', 14, CAST(0x1E330B00 AS Date), 1, N'1000'),
(1035, N'Steeleye Stout', N'1035.jpg', 18, CAST(0x2B340B00 AS Date), 0, N'1000'),
(1036, N'Inlagd Sill', N'1036.jpg', 19, CAST(0xCA080B00 AS Date), 0, N'1007'),
(1037, N'Gravad lax', N'1037.jpg', 26, CAST(0xB80C0B00 AS Date), 0, N'1007'),
(1038, N'Cate de Blaye', N'1038.jpg', 263.5, CAST(0xAC090B00 AS Date), 0, N'1000'),
(1039, N'Chartreuse verte', N'1039.jpg', 18, CAST(0x950D0B00 AS Date), 0, N'1000'),
(1040, N'Boston Crab Meat', N'1040.jpg', 18.4, CAST(0x1F030B00 AS Date), 0, N'1007'),
(1041, N'Jack''s New England Clam Chowder', N'1041.jpg', 9.65, CAST(0x0D070B00 AS Date), 0, N'1007'),
(1042, N'Singaporean Hokkien Fried Mee', N'1042.jpg', 14, CAST(0xC6FE0A00 AS Date), 0, N'1004'),
(1043, N'Ipoh Coffee', N'1043.jpg', 46, CAST(0xCD070B00 AS Date), 0, N'1000'),
(1044, N'Gula Malacca', N'1044.jpg', 19.45, CAST(0x63FA0A00 AS Date), 0, N'1001'),
(1045, N'Rogede sild', N'1045.jpg', 9.5, CAST(0xCA160B00 AS Date), 1, N'1007'),
(1046, N'Spegesild', N'1046.jpg', 12, CAST(0xB81A0B00 AS Date), 0, N'1007'),
(1047, N'Zaanse koeken', N'1047.jpg', 9.5, CAST(0x340A0B00 AS Date), 0, N'1002'),
(1048, N'Chocolade', N'1048.jpg', 12.75, CAST(0x1F0E0B00 AS Date), 0, N'1002'),
(1049, N'Maxilaku', N'1049.jpg', 20, CAST(0x09120B00 AS Date), 0, N'1002'),
(1050, N'Valkoinen suklaa', N'1050.jpg', 16.25, CAST(0xF2150B00 AS Date), 0, N'1002'),
(1051, N'Manjimup Dried Apples', N'1051.jpg', 53, CAST(0x4A2A0B00 AS Date), 0, N'1006'),
(1052, N'Filo Mix', N'1052.jpg', 7, CAST(0x00260B00 AS Date), 0, N'1004'),
(1053, N'Perth Pasties', N'1053.jpg', 32.8, CAST(0x092E0B00 AS Date), 0, N'1005'),
(1054, N'Tourtiare', N'1054.jpg', 7.45, CAST(0xF6310B00 AS Date), 1, N'1005'),
(1055, N'Pacta chinois', N'1055.jpg', 24, CAST(0xC02E0B00 AS Date), 0, N'1005'),
(1056, N'Gnocchi di nonna Alice', N'1056.jpg', 38, CAST(0x8D2E0B00 AS Date), 0, N'1004'),
(1057, N'Ravioli Angelo', N'1057.jpg', 19.5, CAST(0x7A320B00 AS Date), 0, N'1004'),
(1058, N'Escargots de Bourgogne', N'1058.jpg', 13.25, CAST(0x87340B00 AS Date), 0, N'1001'),
(1059, N'Raclette Courdavault', N'1059.jpg', 55, CAST(0x0C2F0B00 AS Date), 0, N'1003'),
(1060, N'Camembert Pierrot', N'1060.jpg', 34, CAST(0xF6320B00 AS Date), 0, N'1003'),
(1061, N'Sirop d''aOrable', N'1061.jpg', 28.5, CAST(0x982E0B00 AS Date), 0, N'1001'),
(1062, N'Tarte au sucre', N'1062.jpg', 49.3, CAST(0x852F0B00 AS Date), 0, N'1002'),
(1063, N'Vegie-spread', N'1063.jpg', 43.9, CAST(0x482F0B00 AS Date), 0, N'1001'),
(1064, N'Wimmers gute Semmelknadel', N'1064.jpg', 33.25, CAST(0x65310B00 AS Date), 0, N'1004'),
(1065, N'Louisiana Fiery Hot Pepper Sauce', N'1065.jpg', 21.05, CAST(0xF82F0B00 AS Date), 0, N'1001'),
(1066, N'Louisiana Hot Spiced Okra', N'1066.jpg', 17, CAST(0xE1330B00 AS Date), 1, N'1001'),
(1067, N'Laughing Lumberjack Lager', N'1067.jpg', 14, CAST(0x9E330B00 AS Date), 1, N'1000'),
(1068, N'Scottish Longbreads', N'1068.jpg', 12.5, CAST(0x9B310B00 AS Date), 0, N'1002'),
(1069, N'Gudbrandsdalsost', N'1069.jpg', 36, CAST(0xFC330B00 AS Date), 0, N'1003'),
(1070, N'Outback Lager', N'1070.jpg', 15, CAST(0x12310B00 AS Date), 0, N'1000'),
(1071, N'Flotemysost', N'1071.jpg', 21.5, CAST(0x75080B00 AS Date), 1, N'1003'),
(1072, N'Mozzarella di Giovanni', N'1072.jpg', 34.8, CAST(0x5F0C0B00 AS Date), 0, N'1003'),
(1073, N'Rad Kaviar', N'1073.jpg', 15, CAST(0xA90B0B00 AS Date), 0, N'1007'),
(1074, N'Longlife Tofu', N'1074.jpg', 10, CAST(0x660B0B00 AS Date), 0, N'1006'),
(1075, N'RhanbrAu Klosterbier', N'1075.jpg', 7.75, CAST(0x880B0B00 AS Date), 0, N'1000'),
(1076, N'Lakkalik AAri', N'1076.jpg', 18, CAST(0x0AFA0A00 AS Date), 0, N'1000'),
(1077, N'Original Frankfurter grane Soae', N'1077.gif', 13, CAST(0x27020B00 AS Date), 0, N'1001'),
(1081, N'Chai', N'1081.jpg', 19, CAST(0x910D0B00 AS Date), 0, N'1000'),
(1083, N'Mishi Kobe Niku', N'1083.jpg', 97, CAST(0x21150B00 AS Date), 0, N'1005')
SET IDENTITY_INSERT [dbo].[Products] OFF

SELECT * FROM categories

