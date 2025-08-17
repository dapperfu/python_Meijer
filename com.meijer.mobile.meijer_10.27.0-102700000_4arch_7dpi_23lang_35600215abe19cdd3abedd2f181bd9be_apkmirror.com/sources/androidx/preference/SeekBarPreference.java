package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fullstory.FS;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    int f57720D;

    /* renamed from: E, reason: collision with root package name */
    int f57721E;

    /* renamed from: F, reason: collision with root package name */
    private int f57722F;

    /* renamed from: G, reason: collision with root package name */
    private int f57723G;

    /* renamed from: H, reason: collision with root package name */
    boolean f57724H;

    /* renamed from: I, reason: collision with root package name */
    SeekBar f57725I;

    /* renamed from: J, reason: collision with root package name */
    private TextView f57726J;

    /* renamed from: K, reason: collision with root package name */
    boolean f57727K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f57728L;

    /* renamed from: M, reason: collision with root package name */
    boolean f57729M;

    /* renamed from: N, reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f57730N;

    /* renamed from: O, reason: collision with root package name */
    private View.OnKeyListener f57731O;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f57729M || !seekBarPreference.f57724H) {
                    seekBarPreference.Y(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.Z(i10 + seekBarPreference2.f57721E);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f57724H = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f57724H = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f57721E != seekBarPreference.f57720D) {
                seekBarPreference.Y(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f57727K && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f57725I;
            if (seekBar == null) {
                FS.log_e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            return seekBar.onKeyDown(i10, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57730N = new a();
        this.f57731O = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141364o1, i10, i11);
        this.f57721E = typedArrayObtainStyledAttributes.getInt(g.f141373r1, 0);
        V(typedArrayObtainStyledAttributes.getInt(g.f141367p1, 100));
        W(typedArrayObtainStyledAttributes.getInt(g.f141376s1, 0));
        this.f57727K = typedArrayObtainStyledAttributes.getBoolean(g.f141370q1, true);
        this.f57728L = typedArrayObtainStyledAttributes.getBoolean(g.f141379t1, false);
        this.f57729M = typedArrayObtainStyledAttributes.getBoolean(g.f141382u1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object L(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    private void X(int i10, boolean z10) {
        int i11 = this.f57721E;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f57722F;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f57720D) {
            this.f57720D = i10;
            Z(i10);
            Q(i10);
            if (z10) {
                H();
            }
        }
    }

    public final void V(int i10) {
        int i11 = this.f57721E;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f57722F) {
            this.f57722F = i10;
            H();
        }
    }

    public final void W(int i10) {
        if (i10 != this.f57723G) {
            this.f57723G = Math.min(this.f57722F - this.f57721E, Math.abs(i10));
            H();
        }
    }

    void Y(SeekBar seekBar) {
        int progress = this.f57721E + seekBar.getProgress();
        if (progress != this.f57720D) {
            if (a(Integer.valueOf(progress))) {
                X(progress, false);
            } else {
                seekBar.setProgress(this.f57720D - this.f57721E);
                Z(this.f57720D);
            }
        }
    }

    void Z(int i10) {
        TextView textView = this.f57726J;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f141236h);
    }
}
