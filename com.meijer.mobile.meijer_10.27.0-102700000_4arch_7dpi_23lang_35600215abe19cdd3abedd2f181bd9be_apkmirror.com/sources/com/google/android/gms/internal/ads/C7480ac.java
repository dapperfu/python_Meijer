package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7480ac {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f72453a = new ByteArrayOutputStream(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f72454b = new Base64OutputStream(this.f72453a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() throws IOException {
        String string;
        try {
            this.f72454b.close();
        } catch (IOException e10) {
            Qc.p.e("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            try {
                this.f72453a.close();
                string = this.f72453a.toString();
            } catch (IOException e11) {
                Qc.p.e("HashManager: Unable to convert to Base64.", e11);
                string = "";
            }
            return string;
        } finally {
            this.f72453a = null;
            this.f72454b = null;
        }
    }
}
