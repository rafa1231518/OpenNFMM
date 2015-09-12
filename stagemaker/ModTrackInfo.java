package stagemaker;

/* ModTrackInfo - Decompiled by JODE extended
 * DragShot Software
 * JODE (c) 1998-2001 Jochen Hoenicke
 */
class ModTrackInfo
{
    byte[] samples;
    int position;
    int length;
    int repeat;
    int replen;
    int volume;
    int error;
    int pitch;
    int old_position;
    int start_period;
    int period;
    int step;
    int effect;
    int portto;
    int vibpos;
    int trempos;
    int oldsampofs;
    int[] arp;
    int arpindex;
    int oldperiod = 1;
    int vol_slide;
    int port_inc;
    int port_up;
    int port_down;
    int vib_rate;
    int vib_depth;
    int trem_rate;
    int trem_depth;
    byte retrig;
    int finetune_rate;
    int period_low_limit;
    int period_high_limit;
    
    ModTrackInfo() {
        this.arp = new int[3];
    }
}
