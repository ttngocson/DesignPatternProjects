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
    public partial class FormConfig : Form
    {
        Config config;
        public FormConfig()
        {
            config = Config.CreateIntance();
            InitializeComponent();
        }

        private void FormConfig_Load(object sender, EventArgs e)
        {
        }

        private void button1_Click(object sender, EventArgs e)
        {
            config.Notify(System.Drawing.Color.Red, "RED");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            config.Notify(System.Drawing.Color.Green, "GREEN");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            config.Notify(System.Drawing.Color.Yellow, "YELLOW");
        }
    }
}
