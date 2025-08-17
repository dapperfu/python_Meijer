package hd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.zza;
import com.google.android.gms.common.api.internal.zzd;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: hd.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14407h {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC14408i f134649a;

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }

    public static InterfaceC14408i c(Activity activity) {
        return d(new C14406g(activity));
    }

    public Activity b() {
        Activity activityQ = this.f134649a.Q();
        com.google.android.gms.common.internal.r.l(activityQ);
        return activityQ;
    }

    protected C14407h(InterfaceC14408i interfaceC14408i) {
        this.f134649a = interfaceC14408i;
    }

    protected static InterfaceC14408i d(C14406g c14406g) {
        if (c14406g.d()) {
            return zzd.r0(c14406g.b());
        }
        if (c14406g.c()) {
            return zza.a(c14406g.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
