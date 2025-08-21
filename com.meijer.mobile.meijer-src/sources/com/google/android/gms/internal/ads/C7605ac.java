package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7605ac {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f73293a = new ByteArrayOutputStream(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f73294b = new Base64OutputStream(this.f73293a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() throws IOException {
        String string;
        try {
            this.f73294b.close();
        } catch (IOException e10) {
            Sc.p.e("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            try {
                this.f73293a.close();
                string = this.f73293a.toString();
            } catch (IOException e11) {
                Sc.p.e("HashManager: Unable to convert to Base64.", e11);
                string = "";
            }
            return string;
        } finally {
            this.f73293a = null;
            this.f73294b = null;
        }
    }
}
