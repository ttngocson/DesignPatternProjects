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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void configToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            FormConfig f = new FormConfig();
            f.Show();
        }

        private void bTN1ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormBTN1 f = new FormBTN1();
            f.Show();
        }

        private void bTN2ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormBTN2 f = new FormBTN2();
            f.Show();
        }
    }
}
