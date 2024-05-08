package modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrintInicial {

    // Todos los prints que ejecuta la aplicación


    public void PaisAconvertir () {
        System.out.println("""
                        *********************************************************************
                                   ELIJA EL NÚMERO DE LA MONEDA QUE DESEA CONVERTIR
                        *********************************************************************
    
                        N°| COD Nombre de la monesa                     Nombre del pais
                        ----------------------------------------------------------------------
                        1	AED	Dírham de los Emiratos Árabes Unidos	Emiratos Árabes Unidos
                        2	AFN	afgano afgano							Afganistán
                        3	ALL	Lek albanés							    Albania
                        4	AMD	Dram armenio							Armenia
                        5	ANG	Florín antillano holandés				Antillas Holandesas
                        6	AOA	Kwanza angoleño							Angola
                        7	ARS	peso argentino							Argentina
                        8	AUD	Dólar australiano						Australia
                        9	AWG	Florín de Aruba							Aruba
                        10	AZN	Manat azerbaiyano						Azerbaiyán
                        11	BAM	Marca de Bosnia y Herzegovina			Bosnia y Herzegovina
                        12	BBD	Dólar de Barbados						Barbados
                        13	BDT	taka bangladesí							Bangladesh
                        14	BGN	Lev búlgaro							    Bulgaria
                        15	BHD	dinar bahreiní							Bahréin
                        16	BIF	Franco burundés							Burundi
                        17	BMD	Dólar de Bermudas						islas Bermudas
                        18	BND	Dólar de Brunéi							Brunéi
                        19	BOB	boliviano boliviano						Bolivia
                        20	BRL	Real brasileño							Brasil
                        21	BSD	dólar bahameño							bahamas
                        22	BTN	Ngultrum butanés						Bután
                        23	BWP	Pula de Botsuana						Botsuana
                        24	BYN	Rublo bielorruso						Bielorrusia
                        25	BZD	Dólar de Belice							Belice
                        26	CAD	Dolar canadiense						Canadá
                        27	CDF	franco congoleño						República Democrática del Congo
                        28	CHF	Franco suizo							Suiza
                        29	CLP	peso chileno							Chile
                        30	CNY	Renminbi chino							Porcelana
                        31	COP	peso colombiano							Colombia
                        32	CRC	Colón costarricense						Costa Rica
                        33	CUP	peso cubano							    Cuba
                        34	CVE	Escudo caboverdiano						Cabo Verde
                        35	CZK	corona checa							República Checa
                        36	DJF	Franco de Yibuti						Yibuti
                        37	DKK	corona danesa							Dinamarca
                        38	DOP	peso dominicano							República Dominicana
                        39	DZD	dinar argelino							Argelia
                        40	EGP	Libra egipcia							Egipto
                        41	ERN	Nakfa eritrea							Eritrea
                        42	ETB	Birr etíope							    Etiopía
                        43	EUR	Euro							        unión Europea
                        44	FJD	Dólar fiyiano							Fiyi
                        45	FKP	Libra de las Islas Malvinas				Islas Malvinas
                        46	FOK	Corona feroesa							Islas Faroe
                        47	GBP	Libra esterlina							Reino Unido
                        48	GEL	Lari georgiano							Georgia
                        49	GGP	Libra de Guernsey						Guernesey
                        50	GHS	cedi ghanés							    Ghana
                        51	GIP	Libra gibraltareña						Gibraltar
                        52	GMD	Dalasi gambiano							Gambia
                        53	GNF	franco guineano							Guinea
                        54	GTQ	Quetzal guatemalteco					Guatemala
                        55	GYD	dólar guyanés							Guayana
                        56	HKD	Dolar de Hong Kong						Hong Kong
                        57	HNL	Lempira hondureña						Honduras
                        58	HRK	kuna croata							    Croacia
                        59	HTG	gourde haitiano							Haití
                        60	HUF	florín húngaro							Hungría
                        61	IDR	rupia indonesia							Indonesia
                        62	ILS	Nuevo séquel israelí					Israel
                        63	IMP	Libra de Man							Isla del hombre
                        64	INR	Rupia india							    India
                        65	IQD	dinar iraquí							Irak
                        66	IRR	rial iraní							    Irán
                        67	ISK	corona islandesa						Islandia
                        68	JEP	Libra de Jersey							Jersey
                        69	JMD	dólar jamaicano							Jamaica
                        70	JOD	dinar jordano							Jordán
                        71	JPY	Yen japonés							    Japón
                        72	KES	Chelín keniano							Kenia
                        73	KGS	som kirguís							    Kirguistán
                        74	KHR	Riel camboyano							Camboya
                        75	KID	Dólar de Kiribati						Kiribati
                        76	KMF	Franco comorano							Comoras
                        77	KRW	Won surcoreano							Corea del Sur
                        78	KWD	dinar kuwaití							Kuwait
                        79	KYD	Dólar de las Islas Caimán				Islas Caimán
                        80	KZT	Tenge kazajo							Kazajstán
                        81	LAK	kip laosiano							Laos
                        82	LBP	libra libanesa							Líbano
                        83	LKR	Rupia de Sri Lanka						Sri Lanka
                        84	LRD	dólar liberiano							Liberia
                        85	LSL	Loti de Lesoto							Lesoto
                        86	LYD	dinar libio							    Libia
                        87	MAD	dírham marroquí							Marruecos
                        88	MDL	Leu moldavo							    Moldavia
                        89	MGA	Ariary malgache							Madagascar
                        90	MKD	Denar macedonio							Macedonia del Norte
                        91	MMK	Kyat birmano							Birmania
                        92	MNT	Tögrög mongol							Mongolia
                        93	MOP	Pataca de Macao							Macao
                        94	MRU	Ouguiya mauritana						Mauritania
                        95	MUR	Rupia de Mauricio						Mauricio
                        96	MVR	Rufiyaa de Maldivas						Maldivas
                        97	MWK	Kwacha de Malawi						Malaui
                        98	MXN	peso mexicano							México
                        99	MYR	Ringgit malayo							Malasia
                        100	MZN	Metical mozambiqueño					Mozambique
                        101	NAD	dólar namibio							Namibia
                        102	NGN	naira nigeriana							Nigeria
                        103	NIO	Córdoba nicaragüense					Nicaragua
                        104	NOK	corona noruega							Noruega
                        105	NPR	rupia nepalí							Nepal
                        106	NZD	Dolar de Nueva Zelanda					Nueva Zelanda
                        107	OMR	Rial omaní							    Omán
                        108	PAB	Balboa panameño							Panamá
                        109	PEN	soles peruanos							Perú
                        110	PGK	Kina de Papúa Nueva Guinea				Papúa Nueva Guinea
                        111	PHP	peso filipino							Filipinas
                        112	PKR	Rupia paquistaní						Pakistán
                        113	PLN	Złoty polaco							Polonia
                        114	PYG	guaraní paraguayo						Paraguay
                        115	QAR	Riyal catarí							Katar
                        116	RON	Leu rumano							    Rumania
                        117	RSD	dinar serbio							Serbia
                        118	RUB	Rublo ruso							    Rusia
                        119	RWF	franco ruandés							Ruanda
                        120	SAR	Riyal saudita							Arabia Saudita
                        121	SBD	Dólar de las Islas Salomón				Islas Salomón
                        122	SCR	Rupia de Seychelles						Seychelles
                        123	SDG	Libra sudanesa							Sudán
                        124	SEK	Corona sueca							Suecia
                        125	SGD	Dolar de Singapur						Singapur
                        126	SHP	Libra de Santa Helena					santa elena
                        127	SLE	Leona de Sierra Leona					Sierra Leona
                        128	SOS	Chelín somalí							Somalia
                        129	SRD	dólar surinamés							Surinam
                        130	SSP	Libra sursudanesa						Sudán del Sur
                        131	STN	Santo Tomé y Príncipe Dobra				Santo Tomé y Príncipe
                        132	SYP	libra siria							    Siria
                        133	SZL	Suazilandia Lilangeni					Esuatini
                        134	THB	Baht tailandés							Tailandia
                        135	TJS	Somoni tayiko							Tayikistán
                        136	TMT	Manat de Turkmenistán					Turkmenistán
                        137	TND	dinar tunecino							Túnez
                        138	TOP	Pa'anga tongano							Tonga
                        139	TRY	Lira turca							    Pavo
                        140	TTD	Dólar de Trinidad y Tobago				Trinidad y Tobago
                        141	TVD	dólar tuvaluano							Tuvalu
                        142	TWD	Nuevo dólar taiwanés					Taiwán
                        143	TZS	Chelín tanzano							Tanzania
                        144	UAH	grivna ucraniana						Ucrania
                        145	UGX	Chelín ugandés							Uganda
                        146	USD	Dólar de los Estados Unidos				Estados Unidos
                        147	UYU	peso uruguayo							Uruguay
                        148	UZS	So'm uzbeko							    Uzbekistán
                        149	VES	Bolívar Soberano venezolano				Venezuela
                        150	VND	Đồng vietnamita							Vietnam
                        151	VUV	VanuatuVatu							    Vanuatu
                        152	WST	Tala samoana							Samoa
                        153	XAF	Franco CFA de África Central			CEMAC
                        154	XCD	Dólar del Caribe Oriental				Organización de Estados del Caribe Oriental
                        155	XDR	Derechos especiales de dibujo			Fondo Monetario Internacional
                        156	XOF	Franco CFA de África Occidental			CFA
                        157	XPF	Franco CFP							    Colectividades de Ultramar
                        158	YER	rial yemení							    Yemen
                        159	ZAR	rand sudafricano						Sudáfrica
                        160	ZMW	Kwacha zambiano							Zambia
                        161	ZWL	dólar zimbabuense						Zimbabue
                """
        );
    }

    public void PaisAlQueSeConvertira() {
        System.out.println("""
                        *********************************************************************
                                                    CONVERTIR A:
                        *********************************************************************
    
                        N°| COD Nombre de la monesa                     Nombre del pais
                        ----------------------------------------------------------------------
                        1	AED	Dírham de los Emiratos Árabes Unidos	Emiratos Árabes Unidos
                        2	AFN	afgano afgano							Afganistán
                        3	ALL	Lek albanés							    Albania
                        4	AMD	Dram armenio							Armenia
                        5	ANG	Florín antillano holandés				Antillas Holandesas
                        6	AOA	Kwanza angoleño							Angola
                        7	ARS	peso argentino							Argentina
                        8	AUD	Dólar australiano						Australia
                        9	AWG	Florín de Aruba							Aruba
                        10	AZN	Manat azerbaiyano						Azerbaiyán
                        11	BAM	Marca de Bosnia y Herzegovina			Bosnia y Herzegovina
                        12	BBD	Dólar de Barbados						Barbados
                        13	BDT	taka bangladesí							Bangladesh
                        14	BGN	Lev búlgaro							    Bulgaria
                        15	BHD	dinar bahreiní							Bahréin
                        16	BIF	Franco burundés							Burundi
                        17	BMD	Dólar de Bermudas						islas Bermudas
                        18	BND	Dólar de Brunéi							Brunéi
                        19	BOB	boliviano boliviano						Bolivia
                        20	BRL	Real brasileño							Brasil
                        21	BSD	dólar bahameño							bahamas
                        22	BTN	Ngultrum butanés						Bután
                        23	BWP	Pula de Botsuana						Botsuana
                        24	BYN	Rublo bielorruso						Bielorrusia
                        25	BZD	Dólar de Belice							Belice
                        26	CAD	Dolar canadiense						Canadá
                        27	CDF	franco congoleño						República Democrática del Congo
                        28	CHF	Franco suizo							Suiza
                        29	CLP	peso chileno							Chile
                        30	CNY	Renminbi chino							Porcelana
                        31	COP	peso colombiano							Colombia
                        32	CRC	Colón costarricense						Costa Rica
                        33	CUP	peso cubano							    Cuba
                        34	CVE	Escudo caboverdiano						Cabo Verde
                        35	CZK	corona checa							República Checa
                        36	DJF	Franco de Yibuti						Yibuti
                        37	DKK	corona danesa							Dinamarca
                        38	DOP	peso dominicano							República Dominicana
                        39	DZD	dinar argelino							Argelia
                        40	EGP	Libra egipcia							Egipto
                        41	ERN	Nakfa eritrea							Eritrea
                        42	ETB	Birr etíope							    Etiopía
                        43	EUR	Euro							        unión Europea
                        44	FJD	Dólar fiyiano							Fiyi
                        45	FKP	Libra de las Islas Malvinas				Islas Malvinas
                        46	FOK	Corona feroesa							Islas Faroe
                        47	GBP	Libra esterlina							Reino Unido
                        48	GEL	Lari georgiano							Georgia
                        49	GGP	Libra de Guernsey						Guernesey
                        50	GHS	cedi ghanés							    Ghana
                        51	GIP	Libra gibraltareña						Gibraltar
                        52	GMD	Dalasi gambiano							Gambia
                        53	GNF	franco guineano							Guinea
                        54	GTQ	Quetzal guatemalteco					Guatemala
                        55	GYD	dólar guyanés							Guayana
                        56	HKD	Dolar de Hong Kong						Hong Kong
                        57	HNL	Lempira hondureña						Honduras
                        58	HRK	kuna croata							    Croacia
                        59	HTG	gourde haitiano							Haití
                        60	HUF	florín húngaro							Hungría
                        61	IDR	rupia indonesia							Indonesia
                        62	ILS	Nuevo séquel israelí					Israel
                        63	IMP	Libra de Man							Isla del hombre
                        64	INR	Rupia india							    India
                        65	IQD	dinar iraquí							Irak
                        66	IRR	rial iraní							    Irán
                        67	ISK	corona islandesa						Islandia
                        68	JEP	Libra de Jersey							Jersey
                        69	JMD	dólar jamaicano							Jamaica
                        70	JOD	dinar jordano							Jordán
                        71	JPY	Yen japonés							    Japón
                        72	KES	Chelín keniano							Kenia
                        73	KGS	som kirguís							    Kirguistán
                        74	KHR	Riel camboyano							Camboya
                        75	KID	Dólar de Kiribati						Kiribati
                        76	KMF	Franco comorano							Comoras
                        77	KRW	Won surcoreano							Corea del Sur
                        78	KWD	dinar kuwaití							Kuwait
                        79	KYD	Dólar de las Islas Caimán				Islas Caimán
                        80	KZT	Tenge kazajo							Kazajstán
                        81	LAK	kip laosiano							Laos
                        82	LBP	libra libanesa							Líbano
                        83	LKR	Rupia de Sri Lanka						Sri Lanka
                        84	LRD	dólar liberiano							Liberia
                        85	LSL	Loti de Lesoto							Lesoto
                        86	LYD	dinar libio							    Libia
                        87	MAD	dírham marroquí							Marruecos
                        88	MDL	Leu moldavo							    Moldavia
                        89	MGA	Ariary malgache							Madagascar
                        90	MKD	Denar macedonio							Macedonia del Norte
                        91	MMK	Kyat birmano							Birmania
                        92	MNT	Tögrög mongol							Mongolia
                        93	MOP	Pataca de Macao							Macao
                        94	MRU	Ouguiya mauritana						Mauritania
                        95	MUR	Rupia de Mauricio						Mauricio
                        96	MVR	Rufiyaa de Maldivas						Maldivas
                        97	MWK	Kwacha de Malawi						Malaui
                        98	MXN	peso mexicano							México
                        99	MYR	Ringgit malayo							Malasia
                        100	MZN	Metical mozambiqueño					Mozambique
                        101	NAD	dólar namibio							Namibia
                        102	NGN	naira nigeriana							Nigeria
                        103	NIO	Córdoba nicaragüense					Nicaragua
                        104	NOK	corona noruega							Noruega
                        105	NPR	rupia nepalí							Nepal
                        106	NZD	Dolar de Nueva Zelanda					Nueva Zelanda
                        107	OMR	Rial omaní							    Omán
                        108	PAB	Balboa panameño							Panamá
                        109	PEN	soles peruanos							Perú
                        110	PGK	Kina de Papúa Nueva Guinea				Papúa Nueva Guinea
                        111	PHP	peso filipino							Filipinas
                        112	PKR	Rupia paquistaní						Pakistán
                        113	PLN	Złoty polaco							Polonia
                        114	PYG	guaraní paraguayo						Paraguay
                        115	QAR	Riyal catarí							Katar
                        116	RON	Leu rumano							    Rumania
                        117	RSD	dinar serbio							Serbia
                        118	RUB	Rublo ruso							    Rusia
                        119	RWF	franco ruandés							Ruanda
                        120	SAR	Riyal saudita							Arabia Saudita
                        121	SBD	Dólar de las Islas Salomón				Islas Salomón
                        122	SCR	Rupia de Seychelles						Seychelles
                        123	SDG	Libra sudanesa							Sudán
                        124	SEK	Corona sueca							Suecia
                        125	SGD	Dolar de Singapur						Singapur
                        126	SHP	Libra de Santa Helena					santa elena
                        127	SLE	Leona de Sierra Leona					Sierra Leona
                        128	SOS	Chelín somalí							Somalia
                        129	SRD	dólar surinamés							Surinam
                        130	SSP	Libra sursudanesa						Sudán del Sur
                        131	STN	Santo Tomé y Príncipe Dobra				Santo Tomé y Príncipe
                        132	SYP	libra siria							    Siria
                        133	SZL	Suazilandia Lilangeni					Esuatini
                        134	THB	Baht tailandés							Tailandia
                        135	TJS	Somoni tayiko							Tayikistán
                        136	TMT	Manat de Turkmenistán					Turkmenistán
                        137	TND	dinar tunecino							Túnez
                        138	TOP	Pa'anga tongano							Tonga
                        139	TRY	Lira turca							    Pavo
                        140	TTD	Dólar de Trinidad y Tobago				Trinidad y Tobago
                        141	TVD	dólar tuvaluano							Tuvalu
                        142	TWD	Nuevo dólar taiwanés					Taiwán
                        143	TZS	Chelín tanzano							Tanzania
                        144	UAH	grivna ucraniana						Ucrania
                        145	UGX	Chelín ugandés							Uganda
                        146	USD	Dólar de los Estados Unidos				Estados Unidos
                        147	UYU	peso uruguayo							Uruguay
                        148	UZS	So'm uzbeko							    Uzbekistán
                        149	VES	Bolívar Soberano venezolano				Venezuela
                        150	VND	Đồng vietnamita							Vietnam
                        151	VUV	VanuatuVatu							    Vanuatu
                        152	WST	Tala samoana							Samoa
                        153	XAF	Franco CFA de África Central			CEMAC
                        154	XCD	Dólar del Caribe Oriental				Organización de Estados del Caribe Oriental
                        155	XDR	Derechos especiales de dibujo			Fondo Monetario Internacional
                        156	XOF	Franco CFA de África Occidental			CFA
                        157	XPF	Franco CFP							    Colectividades de Ultramar
                        158	YER	rial yemení							    Yemen
                        159	ZAR	rand sudafricano						Sudáfrica
                        160	ZMW	Kwacha zambiano							Zambia
                        161	ZWL	dólar zimbabuense						Zimbabue
                """
        );
    }

    public void cantidad() {
        System.out.println("""
                     *********************************************************************
                                ESCRIBA LA CANTIDAD DE DINERO QUE DESEA CONVERTIR
                     *********************************************************************
                """
        );
    }

    public void menu() {
        System.out.println("""
                    \n
                        *********************************************************************
                               $$ BIENVENIDO AL CONVERSOR DE MONEDA HECHO POR ISMAEL $$
                        *********************************************************************
                        Puedes:
                        1   Coventir monedas Latam en monedas comunes rapidamente
                        2   Convertir Dolare Estadunidenses (USD) a monedas Latam
                        3   Elegir paises para convertir moneda
                        4   Historial de conversiones
                        5   Salir
                """
        );
    }

    public void paisesComunes () {
        System.out.println("""
                    \n
                        *********************************************************************
                                   SE CONVERTIRÁ UNA DE ESTAS MONEDAS A DOLAR Y EURO
                        *********************************************************************
                        Elige:
                        7	ARS	peso argentino							Argentina
                        19	BOB	boliviano boliviano						Bolivia
                        20	BRL	Real brasileño							Brasil
                        29	CLP	peso chileno							Chile
                        31	COP	peso colombiano							Colombia
                        32	CRC	Colón costarricense						Costa Rica
                        33	CUP	peso cubano							    Cuba
                        108	PAB	Balboa panameño							Panamá
                        109	PEN	soles peruanos							Perú
                        114	PYG	guaraní paraguayo						Paraguay
                        147	UYU	peso uruguayo							Uruguay
                        149	VES	Bolívar Soberano venezolano				Venezuela
                """);
    }

    public void mensajes(String paisInicial,
                           String paisSalida,
                         String paisTres,
                         Double cantidad0,
                         Double cantidad1,
                         Double cantidad2) {

        var cantidadconvertida = this.decimal(cantidad1);
        var cantidadconvertida2 =this.decimal(cantidad2);
        String mensaje = String.format("""
                                                        DE: %s
                                                         A: %s , %s
                    """, paisInicial, paisSalida, paisTres);
        String mensajeDeCantidad = String.format("""
                            
                            
                                                                  %S  %S
                                ---------------------------------------------------------------------                          
                                                      EQUIVALE A: %S  %S
                                                      EQUIVALE A: %S  %S
                                ---------------------------------------------------------------------
                                *********************************************************************
                            \n
                                        """, cantidad0, paisInicial, cantidadconvertida, paisSalida,
                cantidadconvertida2, paisTres);

        System.out.println("""
                    \n
                        *********************************************************************
                                                     SE CONVIRTIO
                        *********************************************************************
                    """);
        System.out.println(mensaje);
        System.out.println(mensajeDeCantidad);
    }

    public Double decimal (Double cantidad) {
        BigDecimal bd = new BigDecimal(cantidad);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}

