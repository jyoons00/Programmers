SELECT SUBSTRB(PRODUCT_CODE,1,2) CATEGORY, COUNT(*) PRODUCTS
FROM  PRODUCT
GROUP BY SUBSTRB(PRODUCT_CODE,1,2)
ORDER BY CATEGORY ASC;