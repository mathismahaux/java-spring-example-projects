{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red164\green191\blue255;\red25\green22\blue35;\red255\green255\blue255;
\red252\green115\blue96;\red226\green83\blue120;\red254\green219\blue112;}
{\*\expandedcolortbl;;\cssrgb\c70196\c80000\c100000;\cssrgb\c12941\c11765\c18431;\cssrgb\c100000\c100000\c100000;
\cssrgb\c100000\c53725\c45098;\cssrgb\c91765\c42353\c54510;\cssrgb\c100000\c87843\c51373;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
package\cf4  \cf5 com\cf4 .\cf5 codecademy\cf4 .\cf5 boots\cf4 .\cf5 entities\cf4 ;\cb1 \
\
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 Entity\cf4 ;\cb1 \
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 Table\cf4 ;\cb1 \
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 Column\cf4 ;\cb1 \
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 Enumerated\cf4 ;\cb1 \
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 EnumType\cf4 ;\cb1 \
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 Id\cf4 ;\cb1 \
\cf2 \cb3 import\cf4  \cf5 javax\cf4 .\cf5 persistence\cf4 .\cf5 GeneratedValue\cf4 ;\cb1 \
\
\cf2 \cb3 import\cf4  \cf5 com\cf4 .\cf5 codecademy\cf4 .\cf5 boots\cf4 .\cf5 enums\cf4 .\cf5 BootType\cf4 ;\cb1 \
\
\cf6 \cb3 @Entity\cf4 \cb1 \
\cf6 \cb3 @Table\cf4 (\cf5 name\cf4  = \cf7 "BOOTS"\cf4 )\cb1 \
\cf2 \cb3 public\cf4  \cf2 class\cf5  \cf2 Boot\cf4  \{\cb1 \
\cb3   \cf6 @Id\cf4 \cb1 \
\cb3   \cf6 @GeneratedValue\cf4 \cb1 \
\cb3   \cf2 private\cf4  \cf5 Integer\cf4  \cf5 id\cf4 ;\cb1 \
\cb3   \cf6 @Column\cf4 (\cf5 name\cf4  = \cf7 "TYPE"\cf4 )\cb1 \
\cb3   \cf6 @Enumerated\cf4 (\cf5 EnumType\cf4 .\cf5 STRING\cf4 )\cb1 \
\cb3   \cf2 private\cf4  \cf5 BootType\cf4  \cf5 type\cf4 ;\cb1 \
\cb3   \cf6 @Column\cf4 (\cf5 name\cf4  = \cf7 "SIZE"\cf4 )\cb1 \
\cb3   \cf2 private\cf4  \cf5 Float\cf4  \cf5 size\cf4 ;\cb1 \
\cb3   \cf6 @Column\cf4 (\cf5 name\cf4  = \cf7 "QUANTITY"\cf4 )\cb1 \
\cb3   \cf2 private\cf4  \cf5 Integer\cf4  \cf5 quantity\cf4 ;\cb1 \
\cb3   \cf6 @Column\cf4 (\cf5 name\cf4  = \cf7 "MATERIAL"\cf4 )\cb1 \
\cb3   \cf2 private\cf4  \cf5 String\cf4  \cf5 material\cf4 ;\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 Integer\cf4  \cf5 getId\cf4 () \{\cb1 \
\cb3     \cf2 return\cf4  \cf5 id\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 void\cf4  \cf5 setId\cf4 (\cf5 Integer\cf4  \cf5 id\cf4 ) \{\cb1 \
\cb3     \cf2 this\cf4 .\cf5 id\cf4  = \cf5 id\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 BootType\cf4  \cf5 getType\cf4 () \{\cb1 \
\cb3     \cf2 return\cf4  \cf5 type\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 void\cf4  \cf5 setType\cf4 (\cf5 BootType\cf4  \cf5 type\cf4 ) \{\cb1 \
\cb3     \cf2 this\cf4 .\cf5 type\cf4  = \cf5 type\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 Float\cf4  \cf5 getSize\cf4 () \{\cb1 \
\cb3     \cf2 return\cf4  \cf5 size\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 void\cf4  \cf5 setSize\cf4 (\cf5 Float\cf4  \cf5 size\cf4 ) \{\cb1 \
\cb3     \cf2 this\cf4 .\cf5 size\cf4  = \cf5 size\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 Integer\cf4  \cf5 getQuantity\cf4 () \{\cb1 \
\cb3     \cf2 return\cf4  \cf5 quantity\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 void\cf4  \cf5 setQuantity\cf4 (\cf5 Integer\cf4  \cf5 quantity\cf4 ) \{\cb1 \
\cb3     \cf2 this\cf4 .\cf5 quantity\cf4  = \cf5 quantity\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 String\cf4  \cf5 getMaterial\cf4 () \{\cb1 \
\cb3     \cf2 return\cf4  \cf5 material\cf4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf2 public\cf4  \cf5 void\cf4  \cf5 setMaterial\cf4 (\cf5 String\cf4  \cf5 material\cf4 ) \{\cb1 \
\cb3     \cf2 this\cf4 .\cf5 material\cf4  = \cf5 material\cf4 ;\cb1 \
\cb3   \}\cb1 \
\cb3 \}\cb1 \
}