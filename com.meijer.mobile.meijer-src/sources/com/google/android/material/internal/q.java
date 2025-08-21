package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import qe.AbstractC16637f;
import qe.C16635d;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: c, reason: collision with root package name */
    private float f88103c;

    /* renamed from: d, reason: collision with root package name */
    private float f88104d;

    /* renamed from: g, reason: collision with root package name */
    private C16635d f88107g;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f88101a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16637f f88102b = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f88105e = true;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<b> f88106f = new WeakReference<>(null);

    class a extends AbstractC16637f {
        a() {
        }

        @Override // qe.AbstractC16637f
        public void a(int i10) {
            q.this.f88105e = true;
            b bVar = (b) q.this.f88106f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // qe.AbstractC16637f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            q.this.f88105e = true;
            b bVar = (b) q.this.f88106f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f88101a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f88101a.measureText(charSequence, 0, charSequence.length());
    }

    public C16635d e() {
        return this.f88107g;
    }

    public float f(String str) {
        if (!this.f88105e) {
            return this.f88104d;
        }
        i(str);
        return this.f88104d;
    }

    public TextPaint g() {
        return this.f88101a;
    }

    public float h(String str) {
        if (!this.f88105e) {
            return this.f88103c;
        }
        i(str);
        return this.f88103c;
    }

    public void j(b bVar) {
        this.f88106f = new WeakReference<>(bVar);
    }

    public void k(C16635d c16635d, Context context) {
        if (this.f88107g != c16635d) {
            this.f88107g = c16635d;
            if (c16635d != null) {
                c16635d.o(context, this.f88101a, this.f88102b);
                b bVar = this.f88106f.get();
                if (bVar != null) {
                    this.f88101a.drawableState = bVar.getState();
                }
                c16635d.n(context, this.f88101a, this.f88102b);
                this.f88105e = true;
            }
            b bVar2 = this.f88106f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f88105e = z10;
    }

    public void m(boolean z10) {
        this.f88105e = z10;
    }

    public void n(Context context) {
        this.f88107g.n(context, this.f88101a, this.f88102b);
    }

    public q(b bVar) {
        j(bVar);
    }

    private void i(String str) {
        this.f88103c = d(str);
        this.f88104d = c(str);
        this.f88105e = false;
    }
}
