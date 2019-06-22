using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ObseverPattern
{
    class Config
    {
        List<IObserverConfig> listObserver = new List<IObserverConfig>();
        private static Config intance;

        private Config() { }

        public static Config CreateIntance()
        {
            if (intance == null)
                intance = new Config();
            return intance;
        }
        

        public void Attach (IObserverConfig observer)
        {
            listObserver.Add(observer);
        }

        public void Detach (IObserverConfig observer)
        {
            listObserver.Remove(observer);
        }
        public void Notify(System.Drawing.Color color, String text)
        {
            for(int i =0;i<listObserver.Count; i++)
            {
                listObserver[i].updateColor(color);
                listObserver[i].updateText(text);
            }
        }
    }
}
