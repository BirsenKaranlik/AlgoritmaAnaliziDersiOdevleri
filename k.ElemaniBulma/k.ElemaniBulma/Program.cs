using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace k.ElemaniBulma
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 0;

            Console.WriteLine("Dizi kaç elemanli olsun?");

            int eleman = Convert.ToInt32(Console.ReadLine()); 

            int[] dizi = new int[eleman];

            Random rndm = new Random();

            Console.WriteLine("Dizinin ilk hali: ");

            for (int i = 0; i < eleman; i++)
            {
                dizi[i] = rndm.Next(0, 100); 

            }
            for (int i = 0; i < eleman; i++)
            {
                Console.Write(dizi[i] + "-");

            }
           Console.WriteLine();
            Console.Write("Dizinin büyükten küçüğe sıralanmış hali: ");
           

            for (int i = 0; i < dizi.Length - 1; i++)  
            {
                for (int j = 1; j < dizi.Length - i; j++)
                {
                    if (dizi[j] < dizi[j - 1])
                    {
                        int temp = dizi[j - 1];
                        dizi[j - 1] = dizi[j];
                        dizi[j] = temp;
                    }
                }
            }
            Console.WriteLine();

            foreach (int deger in dizi)
            {

                Console.Write(deger + "-");

            }



            Console.ReadLine();

            Console.WriteLine();

            Console.Write("hangi elemani bulmak istersin: "); 
            a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Aradığın eleman:" + dizi[a- 1]); 

            Console.ReadLine();
        }

        }
    }

