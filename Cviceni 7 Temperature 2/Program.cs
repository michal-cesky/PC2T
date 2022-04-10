using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cviceni_7_Temperature_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string pathRead = @"data_load.txt";
            string pathWrite = @"data_save.txt";

            Archive archive = new Archive();

            //archive.Load("data_load.txt");
            //archive.Load(pathRead);
           /* archive.AllTemps();
            archive.AverageYearTemps();
            archive.AverageMonthTemps();
            archive.Calibration(-0.1);
            // archive.Save("data_save.txt");*/
            archive.Load(pathWrite);

            Console.ReadLine();
        }
    }
}
