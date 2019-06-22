using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ObseverPattern
{
    public partial class FormBTN1 : Form, IObserverConfig
    {
        Config config;
        public FormBTN1()
        {
            config = Config.CreateIntance();
            InitializeComponent();
            config.Attach(this);
        }

        public void updateColor(Color color)
        {
            button1.BackColor = color;
        }

        public void updateText(string text)
        {
            button1.Text = text;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            config.Attach(this);
        }

        private void bye_Click(object sender, EventArgs e)
        {
            config.Detach(this);
        }
    }
}
