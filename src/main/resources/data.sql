CREATE TABLE Quotes_Master(
	ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    Business_Value INT NOT NULL,
    Property_Value INT NOT NULL,
    Property_Type VARCHAR(50) NOT NULL,
    Quotes INT NOT NULL,
    Policy_Id INT NOT NULL
);
INSERT INTO Quotes_Master(Business_Value,Property_Value,Property_Type,Quotes,Policy_Id) VALUES (0,0,'Building',81000,1);
INSERT INTO Quotes_Master(Business_Value,Property_Value,Property_Type,Quotes,Policy_Id) VALUES (0,1,'Building',81000,2);
INSERT INTO Quotes_Master(Business_Value,Property_Value,Property_Type,Quotes,Policy_Id) VALUES (0,0,'Property in Transit',99000,2);
INSERT INTO Quotes_Master(Business_Value,Property_Value,Property_Type,Quotes,Policy_Id) VALUES (0,1,'Property in Transit',99000,1);
