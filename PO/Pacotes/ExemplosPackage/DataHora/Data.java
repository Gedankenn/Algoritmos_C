package DataHora;

public class Data
{
  protected byte dia;
  byte m�s;
  short ano;

  public Data(byte d,byte m,short a)
  {
    dia = d; m�s = m; ano = a;
  }

  public String toString()
  {
    return dia+"/"+m�s+"/"+ano;
  }

  } // fim da classe Data
