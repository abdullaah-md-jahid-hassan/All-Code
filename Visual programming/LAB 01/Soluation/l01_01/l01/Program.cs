﻿using System;

namespace l01
{
   class Program
	{
        static void Main(string[] args)
        {
            int i;
            Console.Write("Enter a Number:");
            i = int.Parse(Console.ReadLine());
            if (i % 2 == 0)
            {
                Console.Write("Entered Number is an Even Number");
                Console.Read();
            }
            else
            {
                Console.Write("Entered Number is an OddNumber");
                Console.Read();
            }
        }
    }
}
