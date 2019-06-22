using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ObseverPattern
{
    interface IObserverConfig
    {
        void updateColor(System.Drawing.Color color);
        void updateText(String text);
    }
}
