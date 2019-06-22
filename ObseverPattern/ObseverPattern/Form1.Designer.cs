namespace ObseverPattern
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.configToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.configToolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.formBTNToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.bTN1ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.bTN2ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.configToolStripMenuItem,
            this.formBTNToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(585, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // configToolStripMenuItem
            // 
            this.configToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.configToolStripMenuItem1});
            this.configToolStripMenuItem.Name = "configToolStripMenuItem";
            this.configToolStripMenuItem.Size = new System.Drawing.Size(55, 20);
            this.configToolStripMenuItem.Text = "Config";
            // 
            // configToolStripMenuItem1
            // 
            this.configToolStripMenuItem1.Name = "configToolStripMenuItem1";
            this.configToolStripMenuItem1.Size = new System.Drawing.Size(152, 22);
            this.configToolStripMenuItem1.Text = "Config";
            this.configToolStripMenuItem1.Click += new System.EventHandler(this.configToolStripMenuItem1_Click);
            // 
            // formBTNToolStripMenuItem
            // 
            this.formBTNToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.bTN1ToolStripMenuItem,
            this.bTN2ToolStripMenuItem});
            this.formBTNToolStripMenuItem.Name = "formBTNToolStripMenuItem";
            this.formBTNToolStripMenuItem.Size = new System.Drawing.Size(67, 20);
            this.formBTNToolStripMenuItem.Text = "formBTN";
            // 
            // bTN1ToolStripMenuItem
            // 
            this.bTN1ToolStripMenuItem.Name = "bTN1ToolStripMenuItem";
            this.bTN1ToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.bTN1ToolStripMenuItem.Text = "BTN1";
            this.bTN1ToolStripMenuItem.Click += new System.EventHandler(this.bTN1ToolStripMenuItem_Click);
            // 
            // bTN2ToolStripMenuItem
            // 
            this.bTN2ToolStripMenuItem.Name = "bTN2ToolStripMenuItem";
            this.bTN2ToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.bTN2ToolStripMenuItem.Text = "BTN2";
            this.bTN2ToolStripMenuItem.Click += new System.EventHandler(this.bTN2ToolStripMenuItem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(585, 304);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Form1";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem configToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem configToolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem formBTNToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem bTN1ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem bTN2ToolStripMenuItem;
    }
}

