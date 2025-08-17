package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class zzpi extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f80715a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80716b;

    public zzpi(int i10, int i11, int i12, int i13, C c10, boolean z10, Exception exc) {
        String str;
        String strValueOf = String.valueOf(c10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(") ");
        sb2.append(strValueOf);
        if (true != z10) {
            str = "";
        } else {
            str = " (recoverable)";
        }
        sb2.append(str);
        super(sb2.toString(), exc);
        this.f80715a = i10;
        this.f80716b = z10;
    }
}
