# import pandas as pd
# mydict = [{'a': 1, 'b': 2, 'c': 3, 'd': 4},
#           {'a': 100, 'b': 200, 'c': 300, 'd': 400},
#           {'a': 1000, 'b': 2000, 'c': 3000, 'd': 4000 }]
# df = pd.DataFrame(mydict)

# row = df.iloc[[1]]
# print(row)
# print(row.index[0])


# folders = os.listdir(app_folder_path)
# folders.remove(.DSDS_Store)


import scipy.stats as scpy
x = [0.37037, 0.407407, 0.416667, 0.407407, 0.592593, 0.444444, 0.444444, 0.296296, 0.518519, 0.481481, 0.185185, 0.518519, 0.407407, 0.259259, 0.407407, 0.222222, 0.444444, 0.296296, 0.62963, 0.740741, 0.074074, 0.111111, 0.592593, 0.518519, 0.592593, 0.259259, 0.740741, 0.37037, 0.407407, 0.259259, 0.777778, 0.777778, 0.555556, 0.481481, 0.37037, 0.555556, 0.740741, 0.444444, 0.481481, 0.259259, 0.333333, 0.208333, 0.541667, 0.291667, 0.416667, 0.703704, 0.444444, 0.814815, 0.407407, 0.333333]
#x = [0.37037037, 0.407407407, 0.416666667, 0.407407407, 0.592592593, 0.444444444, 0.444444444, 0.296296296, 0.518518519, 0.481481481, 0.185185185, 0.518518519, 0.407407407, 0.259259259, 0.407407407, 0.222222222, 0.444444444, 0.296296296, 0.62962963, 0.740740741, 0.074074074, 0.111111111, 0.592592593, 0.518518519, 0.592592593, 0.259259259, 0.740740741, 0.37037037, 0.407407407, 0.259259259, 0.777777778, 0.777777778, 0.555555556, 0.481481481, 0.37037037, 0.555555556, 0.740740741, 0.444444444, 0.481481481, 0.259259259, 0.333333333, 0.208333333, 0.541666667, 0.291666667, 0.416666667, 0.703703704, 0.444444444, 0.814814815, 0.407407407, 0.333333333]
x = [0.3703703703703704, 0.4074074074074073, 0.4166666666666667, 0.4074074074074075, 0.5925925925925927, 0.4444444444444443, 0.4444444444444445, 0.2962962962962963, 0.5185185185185186, 0.4814814814814815, 0.1851851851851851, 0.5185185185185186, 0.4074074074074073, 0.2592592592592592, 0.4074074074074075, 0.2222222222222222, 0.4444444444444444, 0.2962962962962963, 0.6296296296296299, 0.7407407407407408, 0.074074074074074, 0.1111111111111111, 0.5925925925925926, 0.5185185185185186, 0.5925925925925928, 0.2592592592592593, 0.7407407407407408, 0.3703703703703704, 0.4074074074074074, 0.2592592592592591, 0.777777777777778, 0.777777777777778, 0.5555555555555556, 0.4814814814814816, 0.3703703703703703, 0.5555555555555556, 0.7407407407407409, 0.4444444444444444, 0.4814814814814815, 0.2592592592592591, 0.3333333333333335, 0.2083333333333333, 0.5416666666666667, 0.2916666666666667, 0.4166666666666668, 0.7037037037037038, 0.4444444444444444, 0.8148148148148149, 0.4074074074074073, 0.3333333333333334]
y = [1, 8, 8, 4, 0, 29, 31, 37, 22, 2, 22, 94, 24, 30, 6, 23, 37, 6, 10, 2, 23, 14, 40, 16, 12, 21, 50, 11, 13, 6, 26, 7, 13, 7, 6, 24, 8, 9, 12, 12, 7, 4, 0, 13, 5, 13, 6, 24, 46, 19]
corr, p_value = scpy.kendalltau(x, y , method="asymptotic" )
print(corr, p_value)
all = scpy.kendalltau(x, y)
print(scpy.kendalltau(x, y))


x = [74.4, 73.75, 59.8, 60.5, 66.14285714, 82.625, 257.4285714, 81.4, 170.2857143, 153.5714286, 241.4, 62.33333333, 53.66666667, 94.2, 113.6666667, 202.25, 237.3333333, 151.5, 435.5, 102.5, 172.5, 28, 264.25, 163.5, 48.85714286, 57.5, 144.7142857, 270.25, 51.6, 159.5, 50.88888889, 83.55555556, 122.125, 82.5, 83.33333333, 74.57142857, 238.4444444, 66.16666667, 101.8571429, 247, 195.5, 318, 47.85714286, 391, 162.1666667, 55.66666667, 85.42857143, 117.8888889, 85.57142857, 238]
y = [1, 8, 8, 4, 0, 29, 31, 37, 22, 2, 22, 94, 24, 30, 6, 23, 37, 6, 10, 2, 23, 14, 40, 16, 12, 21, 50, 11, 13, 6, 26, 7, 13, 7, 6, 24, 8, 9, 12, 12, 7, 4, 0, 13, 5, 13, 6, 24, 46, 19]
corr, p_value = scpy.kendalltau(x, y)
print(corr, p_value)