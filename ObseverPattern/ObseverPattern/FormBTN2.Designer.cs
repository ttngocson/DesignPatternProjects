namespace ObseverPattern
{
    partial class FormBTN2
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
            this.button1 = new System.Windows.Forms.Button();
            this.bye = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(85, 47);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(124, 66);
            this.button1.TabIndex = 0;
            this.button1.Text = "button2";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // bye
            // 
            this.bye.Location = new System.Drawing.Point(85, 153);
            this.bye.Name = "bye";
            this.bye.Size = new System.Drawing.Size(124, 57);
            this.bye.TabIndex = 1;
            this.bye.Text = "BYE";
            this.bye.UseVisualStyleBackColor = true;
            this.bye.Click += new System.EventHandler(this.bye_Click);
            // 
            // FormBTN2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 261);
            this.Controls.Add(this.bye);
            this.Controls.Add(this.button1);
            this.Name = "FormBTN2";
            this.Text = "FormBTN2";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button bye;
    }
}