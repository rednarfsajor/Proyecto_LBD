CREATE TABLE CLIENTES(
        CEDULA VARCHAR2(9) NOT NULL CONSTRAINT CLIENTES_PK PRIMARY KEY,
        NOMBRE VARCHAR2(10),
        PRIMER_APELLIDO VARCHAR2(20),
        SEGUNDO_APELLIDO VARCHAR2(20),
        TIPO VARCHAR2(10),
        TELEFONO VARCHAR2(11),
        DIRECCION VARCHAR2(100),
        CORREO VARCHAR2(30)
)

CREATE TABLE PROVEEDORES(
        CEDULA VARCHAR2(9) NOT NULL CONSTRAINT PROVEEDORES_PK PRIMARY KEY,
        NOMBRE VARCHAR2(10),
        TIPO VARCHAR2(10),
        TELEFONO VARCHAR2(11),
        DIRECCION VARCHAR2(100),
        CORREO VARCHAR2(30),
        PRODUCTOS NUMBER
)

CREATE TABLE VENTAS(
        ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY CONSTRAINT VENTAS_PK PRIMARY KEY,
        MONTO NUMBER,
        PRODUCTOS VARCHAR2(50),
        PAGO VARCHAR2(25),
        COMPRADOR VARCHAR2(9) CONSTRAINT COMPRADOR_FK REFERENCES CLIENTES(CEDULA),
        VENDEDOR VARCHAR2(9) CONSTRAINT VENDEDOR_FK REFERENCES PROVEEDORES(CEDULA),
        FECHA DATE,
        CANTIDADES NUMBER
)

INSERT INTO VENTAS (45,'TEST','TARJETA','117880731','117880731',SYSDATE,3)
