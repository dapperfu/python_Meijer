package com.bugsnag.android;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* renamed from: com.bugsnag.android.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6615q0 {
    static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    static int b(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                break;
            }
            writer.write(cArr, 0, i10);
            j10 += i10;
        }
        if (j10 > 2147483647L) {
            return -1;
        }
        return (int) j10;
    }

    static void c(File file, D0 d02) {
        try {
            if (!file.delete()) {
                file.deleteOnExit();
            }
        } catch (Exception e10) {
            d02.b("Failed to delete file", e10);
        }
    }
}
