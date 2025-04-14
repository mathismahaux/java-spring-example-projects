{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red164\green191\blue255;\red25\green22\blue35;\red255\green255\blue255;
\red252\green115\blue96;\red226\green83\blue120;\red254\green219\blue112;\red191\green98\blue181;\red129\green131\blue134;
}
{\*\expandedcolortbl;;\cssrgb\c70196\c80000\c100000;\cssrgb\c12941\c11765\c18431;\cssrgb\c100000\c100000\c100000;
\cssrgb\c100000\c53725\c45098;\cssrgb\c91765\c42353\c54510;\cssrgb\c100000\c87843\c51373;\cssrgb\c80000\c48235\c76078;\cssrgb\c57647\c58431\c59608;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs32 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 package\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 controllers\cf4 \strokec4 ;\cb1 \
\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 lang\cf4 \strokec4 .\cf5 \strokec5 Iterable\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 util\cf4 \strokec4 .\cf5 \strokec5 ArrayList\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 util\cf4 \strokec4 .\cf5 \strokec5 List\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 util\cf4 \strokec4 .\cf5 \strokec5 Objects\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 util\cf4 \strokec4 .\cf5 \strokec5 Arrays\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 java\cf4 \strokec4 .\cf5 \strokec5 util\cf4 \strokec4 .\cf5 \strokec5 Optional\cf4 \strokec4 ;\cb1 \
\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 RestController\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 RequestMapping\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 DeleteMapping\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 GetMapping\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 PathVariable\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 PostMapping\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 PutMapping\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 RequestBody\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 org\cf4 \strokec4 .\cf5 \strokec5 springframework\cf4 \strokec4 .\cf5 \strokec5 web\cf4 \strokec4 .\cf5 \strokec5 bind\cf4 \strokec4 .\cf5 \strokec5 annotation\cf4 \strokec4 .\cf5 \strokec5 RequestParam\cf4 \strokec4 ;\cb1 \
\
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 entities\cf4 \strokec4 .\cf5 \strokec5 Boot\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 enums\cf4 \strokec4 .\cf5 \strokec5 BootType\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 exceptions\cf4 \strokec4 .\cf5 \strokec5 QueryNotSupportedException\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 boots\cf4 \strokec4 .\cf5 \strokec5 exceptions\cf4 \strokec4 .\cf5 \strokec5 NotImplementedException\cf4 \strokec4 ;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4  \cf5 \strokec5 com\cf4 \strokec4 .\cf5 \strokec5 codecademy\cf4 \strokec4 .\cf5 \strokec5 people\cf4 \strokec4 .\cf5 \strokec5 repositories\cf4 \strokec4 .\cf5 \strokec5 PersonRepository\cf4 \strokec4 ;\cb1 \
\
\pard\pardeftab720\partightenfactor0
\cf6 \cb3 \strokec6 @RestController\cf4 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 @RequestMapping\cf4 \strokec4 (\cf7 \strokec7 "/api/v1/boots"\cf4 \strokec4 )\cb1 \
\pard\pardeftab720\partightenfactor0
\cf2 \cb3 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf5 \strokec5  \cf2 \strokec2 BootController\cf4 \strokec4  \{\cb1 \
\pard\pardeftab720\partightenfactor0
\cf4 \cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 BootController\cf4 \strokec4 (\cf5 \strokec5 BootRepository\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 ) \{\cb1 \
\cb3     \cf2 \strokec2 this\cf4 \strokec4 .\cf5 \strokec5 bootRepository\cf4 \strokec4  = \cf5 \strokec5 bootRepository\cf4 \strokec4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @GetMapping\cf4 \strokec4 (\cf7 \strokec7 "/"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 Iterable\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 getAllBoots\cf4 \strokec4 () \{\cb1 \
\cb3     \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findAll\cf4 \strokec4 ();\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @GetMapping\cf4 \strokec4 (\cf7 \strokec7 "/types"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 BootType\cf4 \strokec4 > \cf5 \strokec5 getBootTypes\cf4 \strokec4 () \{\cb1 \
\cb3     \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 Arrays\cf4 \strokec4 .\cf5 \strokec5 asList\cf4 \strokec4 (\cf5 \strokec5 BootType\cf4 \strokec4 .\cf5 \strokec5 values\cf4 \strokec4 ());\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @PostMapping\cf4 \strokec4 (\cf7 \strokec7 "/"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 addBoot\cf4 \strokec4 (\cf6 \strokec6 @RequestBody\cf4 \strokec4  \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4 ) \{\cb1 \
\cb3     \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 save\cf4 \strokec4 (\cf5 \strokec5 boot\cf4 \strokec4 );\cb1 \
\cb3     \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4 ;\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @DeleteMapping\cf4 \strokec4 (\cf7 \strokec7 "/\{id\}"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 deleteBoot\cf4 \strokec4 (\cf6 \strokec6 @PathVariable\cf4 \strokec4 (\cf7 \strokec7 "id"\cf4 \strokec4 ) \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 id\cf4 \strokec4 ) \{\cb1 \
\cb3     \cf5 \strokec5 Optional\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 bootToDelete\cf4 \strokec4  = \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findById\cf4 \strokec4 (\cf5 \strokec5 id\cf4 \strokec4 );\cb1 \
\cb3     \cf2 \strokec2 if\cf4 \strokec4  (!\cf5 \strokec5 bootToDelete\cf4 \strokec4 .\cf5 \strokec5 IsPresent\cf4 \strokec4 ()) \{\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf8 \strokec8 null\cf4 \strokec4 ;\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3       \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4  = \cf5 \strokec5 bootToDelete\cf4 \strokec4 .\cf5 \strokec5 get\cf4 \strokec4 ();\cb1 \
\cb3       \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 delete\cf4 \strokec4 (\cf5 \strokec5 boot\cf4 \strokec4 );\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @PutMapping\cf4 \strokec4 (\cf7 \strokec7 "/\{id\}/quantity/increment"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 incrementQuantity\cf4 \strokec4 (\cf6 \strokec6 @PathVariable\cf4 \strokec4 (\cf7 \strokec7 "id"\cf4 \strokec4 ) \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 id\cf4 \strokec4 ) \{\cb1 \
\cb3     \cf5 \strokec5 Optional\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 bootToIncrement\cf4 \strokec4  = \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findById\cf4 \strokec4 (\cf5 \strokec5 id\cf4 \strokec4 );\cb1 \
\cb3     \cf2 \strokec2 if\cf4 \strokec4  (!\cf5 \strokec5 bootToIncrement\cf4 \strokec4 .\cf5 \strokec5 IsPresent\cf4 \strokec4 ()) \{\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf8 \strokec8 null\cf4 \strokec4 ;\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3       \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4  = \cf5 \strokec5 bootToIncrement\cf4 \strokec4 .\cf5 \strokec5 get\cf4 \strokec4 ();\cb1 \
\cb3       \cf5 \strokec5 boot\cf4 \strokec4 .\cf5 \strokec5 setQuantity\cf4 \strokec4 (\cf5 \strokec5 boot\cf4 \strokec4 .\cf5 \strokec5 getQuantity\cf4 \strokec4  + \cf5 \strokec5 1\cf4 \strokec4 );\cb1 \
\cb3       \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 save\cf4 \strokec4 (\cf5 \strokec5 boot\cf4 \strokec4 );\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @PutMapping\cf4 \strokec4 (\cf7 \strokec7 "/\{id\}/quantity/decrement"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 decrementQuantity\cf4 \strokec4 (\cf6 \strokec6 @PathVariable\cf4 \strokec4 (\cf7 \strokec7 "id"\cf4 \strokec4 ) \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 id\cf4 \strokec4 ) \{\cb1 \
\cb3     \cf5 \strokec5 Optional\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 bootToDecrement\cf4 \strokec4  = \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findById\cf4 \strokec4 (\cf5 \strokec5 id\cf4 \strokec4 );\cb1 \
\cb3     \cf2 \strokec2 if\cf4 \strokec4  (!\cf5 \strokec5 bootToDecrement\cf4 \strokec4 .\cf5 \strokec5 IsPresent\cf4 \strokec4 ()) \{\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf8 \strokec8 null\cf4 \strokec4 ;\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3       \cf5 \strokec5 Boot\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4  = \cf5 \strokec5 bootToDecrement\cf4 \strokec4 .\cf5 \strokec5 get\cf4 \strokec4 ();\cb1 \
\cb3       \cf5 \strokec5 boot\cf4 \strokec4 .\cf5 \strokec5 setQuantity\cf4 \strokec4 (\cf5 \strokec5 boot\cf4 \strokec4 .\cf5 \strokec5 getQuantity\cf4 \strokec4  + \cf5 \strokec5 1\cf4 \strokec4 );\cb1 \
\cb3       \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 save\cf4 \strokec4 (\cf5 \strokec5 boot\cf4 \strokec4 );\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 boot\cf4 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3   \}\cb1 \
\
\cb3   \cf6 \strokec6 @GetMapping\cf4 \strokec4 (\cf7 \strokec7 "/search"\cf4 \strokec4 )\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf5 \strokec5 List\cf4 \strokec4 <\cf5 \strokec5 Boot\cf4 \strokec4 > \cf5 \strokec5 searchBoots\cf4 \strokec4 (\cf6 \strokec6 @RequestParam\cf4 \strokec4 (\cf5 \strokec5 required\cf4 \strokec4  = \cf8 \strokec8 false\cf4 \strokec4 ) \cf5 \strokec5 String\cf4 \strokec4  \cf5 \strokec5 material\cf4 \strokec4 ,\cb1 \
\cb3       \cf6 \strokec6 @RequestParam\cf4 \strokec4 (\cf5 \strokec5 required\cf4 \strokec4  = \cf8 \strokec8 false\cf4 \strokec4 ) \cf5 \strokec5 BootType\cf4 \strokec4  \cf5 \strokec5 type\cf4 \strokec4 , \cf6 \strokec6 @RequestParam\cf4 \strokec4 (\cf5 \strokec5 required\cf4 \strokec4  = \cf8 \strokec8 false\cf4 \strokec4 ) \cf5 \strokec5 Float\cf4 \strokec4  \cf5 \strokec5 size\cf4 \strokec4 ,\cb1 \
\cb3       \cf6 \strokec6 @RequestParam\cf4 \strokec4 (\cf5 \strokec5 required\cf4 \strokec4  = \cf8 \strokec8 false\cf4 \strokec4 , \cf5 \strokec5 name\cf4 \strokec4  = \cf7 \strokec7 "quantity"\cf4 \strokec4 ) \cf5 \strokec5 Integer\cf4 \strokec4  \cf5 \strokec5 minQuantity\cf4 \strokec4 ) \cf2 \strokec2 throws\cf4 \strokec4  \cf5 \strokec5 QueryNotSupportedException\cf4 \strokec4  \{\cb1 \
\cb3     \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 material\cf4 \strokec4 )) \{\cb1 \
\cb3       \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 ) && \cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 ) && \cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a material, type, size, and minimum\cf4 \cb1 \strokec4 \
\cb3         \cf9 \strokec9 // quantity\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByMaterialAndTypeAndSizeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 size\cf4 \strokec4 , \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 ) && \cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a material, size, and type\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByMaterialAndTypeAndSize\cf4 \strokec4 (\cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 size\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 ) && \cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a material, a type, and a minimum\cf4 \cb1 \strokec4 \
\cb3         \cf9 \strokec9 // quantity\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByMaterialAndTypeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a material and a type\cf4 \cb1 \strokec4 \
\cb3         \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByMaterialAndType\cf4 \strokec4 (\cf5 \strokec5 material\cf4 \strokec4 , \cf5 \strokec5 type\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts only a material\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByMaterial\cf4 \strokec4 (\cf5 \strokec5 material\cf4 \strokec4 );\cb1 \
\cb3       \}\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 ) && \cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a type, size, and minimum quantity\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByTypeAndSizeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 size\cf4 \strokec4 , \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a type and a size\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByTypeAndSize\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 size\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a type and a minimum quantity\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByTypeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 , \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accept only a type\cf4 \cb1 \strokec4 \
\cb3         \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByType\cf4 \strokec4 (\cf5 \strokec5 type\cf4 \strokec4 );\cb1 \
\cb3       \}\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 )) \{\cb1 \
\cb3       \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 )) \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts a size and a minimum quantity\cf4 \cb1 \strokec4 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findBySizeAndQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 , \cf5 \strokec5 minQuantity\cf4 \strokec4 );\cb1 \
\cb3       \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3         \cf9 \strokec9 // call the repository method that accepts only a size\cf4 \cb1 \strokec4 \
\cb3         \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findBySize\cf4 \strokec4 (\cf5 \strokec5 size\cf4 \strokec4 );\cb1 \
\cb3       \}\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  (\cf5 \strokec5 Objects\cf4 \strokec4 .\cf5 \strokec5 nonNull\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 )) \{\cb1 \
\cb3       \cf9 \strokec9 // call the repository method that accepts only a minimum quantity\cf4 \cb1 \strokec4 \
\cb3       \cf5 \strokec5 bootRepository\cf4 \strokec4 .\cf5 \strokec5 findByQuantityGreaterThan\cf4 \strokec4 (\cf5 \strokec5 minQuantity\cf4 \strokec4 );\cb1 \
\cb3     \} \cf2 \strokec2 else\cf4 \strokec4  \{\cb1 \
\cb3       \cf2 \strokec2 throw\cf4 \strokec4  \cf2 \strokec2 new\cf4 \strokec4  \cf5 \strokec5 QueryNotSupportedException\cf4 \strokec4 (\cf7 \strokec7 "This query is not supported! Try a different combination of search parameters."\cf4 \strokec4 );\cb1 \
\cb3     \}\cb1 \
\cb3   \}\cb1 \
\
\cb3 \}\cb1 \
}