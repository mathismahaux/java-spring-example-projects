{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red164\green191\blue255;\red25\green22\blue35;\red255\green255\blue255;
\red252\green115\blue96;}
{\*\expandedcolortbl;;\cssrgb\c70196\c80000\c100000;\cssrgb\c12941\c11765\c18431;\cssrgb\c100000\c100000\c100000;
\cssrgb\c100000\c53725\c45098;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 package\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 repositories\cf4 \strokec4 ;\cf4 \cb1 \strokec4 \
\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 util\cf4 \strokec4 .\cf5 \strokec5 List\cf4 \strokec4 ;\cf4 \cb1 \strokec4 \
\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 data\cf4 \strokec4 .\cf5 \strokec5 repository\cf4 \strokec4 .\cf5 \strokec5 CrudRepository\cf4 \strokec4 ;\cf4 \cb1 \strokec4 \
\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 entities\cf4 \strokec4 .\cf5 \strokec5 Boot\cf4 \strokec4 ;\cf4 \cb1 \strokec4 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 enums\cf4 \strokec4 .\cf5 \strokec5 BootType\cf4 \strokec4 ;\cf4 \cb1 \strokec4 \
\
\cf2 \cb3 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 interface\cf4 \strokec4  \cf5 \strokec5 BootRepository\cf4 \strokec4  \cf2 \strokec2 extends\cf4 \strokec4  \cf5 \strokec5 CrudRepository\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 , \cf5 \strokec5 Integer\cf4 \strokec4 > \{\cf4 \cb1 \strokec4 \
\pard\pardeftab720\partightenfactor0
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByMaterial\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf5 \strokec5 material\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByMaterialAndTypeAndSizeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 , \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByMaterialAndTypeAndSize\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByMaterialAndTypeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByMaterialAndType\cf4 \strokec4 (\cf5 \strokec5 String\cf4 \strokec4  \cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByType\cf4 \strokec4 (\cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByTypeAndSizeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 , \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByTypeAndSize\cf4 \strokec4 (\cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByTypeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findBySize\cf4 \strokec4 (\cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findBySizeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 , \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\
\cf4 \cb3 \strokec4   \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 findByQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cf4 \cb1 \strokec4 \
\cf4 \cb3 \strokec4 \}\cf4 \cb1 \strokec4 \
}