using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace maximumEleman
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Dizi kaç elemanlı olsun ?");

            int eleman = Convert.ToInt32(Console.ReadLine());

            int[] dizi = new int[eleman];

            Random rndm = new Random();

            Console.WriteLine("Dizimiz: ");

            for (int i = 0; i < eleman; i++)
            {
                dizi[i] = rndm.Next(0, 1000);

            }
            for (int i = 0; i < eleman; i++)
            {
                Console.Write(dizi[i] + "-");

            }
            Console.WriteLine();

            int maxEleman = dizi[0];

            for (int i = 1; i < dizi.Length; i++)
            {
                if (dizi[i] > maxEleman) 
                { maxEleman = dizi[i];
                }
            }
            Console.WriteLine("Maximum Eleman:" + maxEleman);

            Console.ReadLine();
        }
    }
}
