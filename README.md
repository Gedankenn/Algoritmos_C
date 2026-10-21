# Algoritmos_C

All my code in C (plus some Java and Python) from university courses and practice. It is an archive of exercises, kept as written at the time.

## Contents

| Folder / files | Content |
|----------------|---------|
| `algoritimos1/`, `algoritimos2/`, `algoritimos2.0/`, `algoritmos2.2/` | C exercises and assignments from the Algorithms 1 and 2 courses |
| `programacao_orientada/`, `PO/` | Java projects from the object-oriented programming course (inheritance/polymorphism, exceptions, collections, packages, GUIs, threads) |
| `Desafio_COMP/` | Programming challenge solutions in C |
| `Circuitos_Digitais/` | C program from the digital circuits course |
| `warshall/` | Warshall's algorithm (transitive closure) in C |
| `C++/` | A C++ exercise |
| `python/` | Small Python scripts: Fibonacci (naive, dynamic, fast), binary search, quicksort, factorial, quadratic formula, matrices, mouse/screen automation |
| `Whatsapp/`, `whats_historico.c` | C tool that reads a WhatsApp chat export and counts messages per contact per month, with the resulting CSV/XLSX tables (`Whatsapp/test.c` experiments with koolplot for plotting) |
| root `.c` files | Standalone exercises: quadratic formula (`baskara_2.0.c`), greedy knapsack study (`metodo_guloso_estudo_mochila.c`), primes, probability, scheduling (`escalonamento.c`), memory/struct tests |
| `.m` files | MATLAB scripts used to plot results (e.g. greedy-method study) |

## Building

Each C file is a standalone program:

```bash
gcc -Wall file.c -o file
```

Some programs were written for Windows (e.g. the koolplot/WinBGI plotting test in `Whatsapp/`) and need MinGW to build.
