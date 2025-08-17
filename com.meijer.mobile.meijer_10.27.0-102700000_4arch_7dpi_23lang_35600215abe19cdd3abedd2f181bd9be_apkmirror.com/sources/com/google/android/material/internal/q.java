package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import oe.AbstractC16029f;
import oe.C16027d;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: c, reason: collision with root package name */
    private float f87263c;

    /* renamed from: d, reason: collision with root package name */
    private float f87264d;

    /* renamed from: g, reason: collision with root package name */
    private C16027d f87267g;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f87261a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16029f f87262b = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f87265e = true;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<b> f87266f = new WeakReference<>(null);

    class a extends AbstractC16029f {
        a() {
        }

        @Override // oe.AbstractC16029f
        public void a(int i10) {
            q.this.f87265e = true;
            b bVar = (b) q.this.f87266f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // oe.AbstractC16029f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            q.this.f87265e = true;
            b bVar = (b) q.this.f87266f.get();
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
        return Math.abs(this.f87261a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f87261a.measureText(charSequence, 0, charSequence.length());
    }

    public C16027d e() {
        return this.f87267g;
    }

    public float f(String str) {
        if (!this.f87265e) {
            return this.f87264d;
        }
        i(str);
        return this.f87264d;
    }

    public TextPaint g() {
        return this.f87261a;
    }

    public float h(String str) {
        if (!this.f87265e) {
            return this.f87263c;
        }
        i(str);
        return this.f87263c;
    }

    public void j(b bVar) {
        this.f87266f = new WeakReference<>(bVar);
    }

    public void k(C16027d c16027d, Context context) {
        if (this.f87267g != c16027d) {
            this.f87267g = c16027d;
            if (c16027d != null) {
                c16027d.o(context, this.f87261a, this.f87262b);
                b bVar = this.f87266f.get();
                if (bVar != null) {
                    this.f87261a.drawableState = bVar.getState();
                }
                c16027d.n(context, this.f87261a, this.f87262b);
                this.f87265e = true;
            }
            b bVar2 = this.f87266f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f87265e = z10;
    }

    public void m(boolean z10) {
        this.f87265e = z10;
    }

    public void n(Context context) {
        this.f87267g.n(context, this.f87261a, this.f87262b);
    }

    public q(b bVar) {
        j(bVar);
    }

    private void i(String str) {
        this.f87263c = d(str);
        this.f87264d = c(str);
        this.f87265e = false;
    }
}
