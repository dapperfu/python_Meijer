package androidx.loader.app;

import androidx.view.InterfaceC6030s;
import androidx.view.h0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();

    public static <T extends InterfaceC6030s & h0> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }
}
