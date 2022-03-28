# Python中isort包的使用

## isort包的作用
格式化python导入模块部分。python经常需要导入其他模块，但是导入模块的代码混乱不堪，使用isort可以美化这部分的代码

## 下载
pip install isort

## 格式化导入模块的代码
>isort -ls old.py

或者：

```
import isort
code = """
import tkinter as tk
import pygame, sys
"""
print(isort.code(code))
```

## 案例如下：

### 使用前
```
from my_lib import Object
print("Hey")
import os
from my_lib import Object3
from my_lib import Object2
import sys
from third_party import lib15, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, lib10, lib11, lib12, lib13, lib14
import sys
from __future__ import absolute_import
from third_party import lib3
print("yo")
```
### 使用后
```
from __future__ import absolute_import
import os
import sys
from third_party import (lib1, lib2, lib3, lib4, lib5, lib6,lib7, lib8,lib9, lib10, lib11, lib12, lib13, lib14, lib15)
from my_lib import Object, Object2, Object3
print("Hey")
print("yo")
```
