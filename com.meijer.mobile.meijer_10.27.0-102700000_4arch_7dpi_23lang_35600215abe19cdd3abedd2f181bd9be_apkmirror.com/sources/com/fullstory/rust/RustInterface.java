package com.fullstory.rust;

import com.fullstory.FS;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.util.Log;
import fsimpl.C13966ar;
import fsimpl.C14085fc;
import fsimpl.C14093fk;
import fsimpl.InterfaceC14084fb;
import fsimpl.InterfaceC14086fd;
import fsimpl.InterfaceC14090fh;
import fsimpl.cT;
import fsimpl.fH;
import fsimpl.gh;
import fsimpl.gk;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public class RustInterface {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC14084fb f64365b;

    /* renamed from: c, reason: collision with root package name */
    private long f64366c;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f64364a = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final Object f64367d = new C14085fc(this);

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Throwable th2) {
        Log.e("Unexpected exception in Rust callback.", th2);
        Bootstrap.fail(-32768, "Unexpected exception in Rust callback.");
    }

    private void a(byte[] bArr) {
        jni_java_submit_events(this.f64366c, bArr);
    }

    private static native void jni_java_accumulate_and_finish_pointer(long j10, int i10, float f10, float f11);

    private static native void jni_java_accumulate_pointer(long j10, int i10, float f10, float f11);

    private static native void jni_java_activity_change_event(long j10, String str, short s10);

    private static native void jni_java_crash_event(long j10, String str, Object[] objArr);

    private static native void jni_java_finish_all_pointers(long j10);

    private static native void jni_java_finish_pointer(long j10, int i10);

    private static native int jni_java_get_webview_api_msg_type();

    private static native void jni_java_http_complete(long j10, long j11, int i10, byte[] bArr);

    private static native void jni_java_input_event(long j10, short s10, long j11, String str);

    private static native boolean jni_java_is_url_allowlisted(long j10, String str);

    private static native void jni_java_json_api(long j10, String str);

    private static native void jni_java_keep_event(long j10, short s10, long j11);

    private static native void jni_java_key_event(long j10, int i10, int i11);

    private static native void jni_java_keyboard_visibility_change_event(long j10, boolean z10);

    private static native void jni_java_log_event(long j10, short s10, String str, String str2);

    private static native void jni_java_low_memory_event(long j10, long j11, long j12);

    private static native String jni_java_make_base_injection_snippet(String str, String str2);

    private static native String jni_java_make_consent_snippet(String str, boolean z10);

    private static native String jni_java_make_run_on_start_snippet(String str, String str2);

    private static native String jni_java_make_shutdown_snippet(String str);

    private static native void jni_java_pause(long j10, int i10);

    private static native int jni_java_record_string(long j10, String str);

    private static native int jni_java_record_view_canvas(long j10, long j11, byte[] bArr, int i10);

    private static native long jni_java_register(Object obj, boolean z10);

    private static native void jni_java_restart(long j10);

    private static native void jni_java_secondary_nav_event(long j10, short s10, short s11, String str);

    private static native void jni_java_send_internal_message(long j10, String str);

    private static native void jni_java_shutdown(long j10);

    private static native void jni_java_submit_events(long j10, byte[] bArr);

    private static native void jni_java_unpause(long j10);

    private static native void jni_java_user_activity_event(long j10);

    private static native void jni_java_webview_message(long j10, long j11, int i10, int i11, int i12, String str);

    private static native void jni_java_webview_not_recording(long j10, long j11, int i10, short s10);

    public int a(long j10, ByteBuffer byteBuffer) {
        return jni_java_record_view_canvas(this.f64366c, j10, byteBuffer.array(), byteBuffer.limit());
    }

    public C13966ar a() {
        InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f64364a.get();
        if (interfaceC14086fd != null) {
            return interfaceC14086fd.b();
        }
        return null;
    }

    public String a(String str) {
        return jni_java_make_shutdown_snippet(str);
    }

    public String a(String str, String str2) {
        return jni_java_make_base_injection_snippet(str, str2);
    }

    public String a(String str, boolean z10) {
        return jni_java_make_consent_snippet(str, z10);
    }

    public String a(boolean z10) {
        InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f64364a.get();
        if (interfaceC14086fd != null) {
            return interfaceC14086fd.a(z10);
        }
        return null;
    }

    public void a(int i10) {
        FS.__clearSession();
        jni_java_pause(this.f64366c, i10);
    }

    public void a(int i10, float f10, float f11) {
        jni_java_accumulate_pointer(this.f64366c, i10, f10, f11);
    }

    public void a(int i10, int i11) {
        jni_java_key_event(this.f64366c, i10, i11);
    }

    public void a(long j10) {
        jni_java_webview_message(this.f64366c, j10, 0, 0, 0, null);
    }

    public void a(long j10, int i10, byte b10, String str) {
        jni_java_webview_message(this.f64366c, j10, 1, b10, i10, str);
    }

    public void a(long j10, int i10, short s10) {
        jni_java_webview_not_recording(this.f64366c, j10, i10, s10);
    }

    public void a(long j10, int i10, byte[] bArr) {
        jni_java_http_complete(this.f64366c, j10, i10, bArr);
    }

    public void a(long j10, long j11) {
        jni_java_low_memory_event(this.f64366c, j10, j11);
    }

    public void a(InterfaceC14084fb interfaceC14084fb) {
        this.f64365b = interfaceC14084fb;
        this.f64366c = jni_java_register(this.f64367d, !Log.DISABLE_LOGGING);
    }

    public void a(InterfaceC14090fh interfaceC14090fh) {
        if (interfaceC14090fh == null) {
            return;
        }
        gh ghVar = new gh();
        fH fHVar = new fH();
        interfaceC14090fh.a(ghVar, fHVar);
        if (fHVar.b() > 0) {
            ghVar.h(cT.a(ghVar, cT.a(ghVar, fHVar.c())));
            ByteBuffer byteBufferSlice = gk.a(ghVar).slice();
            int iRemaining = byteBufferSlice.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBufferSlice.get(bArr, 0, iRemaining);
            a(bArr);
        }
    }

    public void a(C14093fk c14093fk) {
        a((InterfaceC14090fh) c14093fk);
    }

    public void a(String str, short s10) {
        jni_java_activity_change_event(this.f64366c, str, s10);
    }

    public void a(String str, String[] strArr) {
        jni_java_crash_event(this.f64366c, str, strArr);
    }

    public void a(short s10, long j10) {
        jni_java_keep_event(this.f64366c, s10, j10);
    }

    public void a(short s10, long j10, String str) {
        long j11 = this.f64366c;
        if (str == null) {
            str = "";
        }
        jni_java_input_event(j11, s10, j10, str);
    }

    public void a(short s10, String str, String str2) {
        jni_java_log_event(this.f64366c, s10, str, str2);
    }

    public void a(short s10, short s11, String str) {
        jni_java_secondary_nav_event(this.f64366c, s10, s11, str);
    }

    public String b() {
        InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f64364a.get();
        if (interfaceC14086fd != null) {
            return interfaceC14086fd.a();
        }
        return null;
    }

    public String b(String str, String str2) {
        return jni_java_make_run_on_start_snippet(str, str2);
    }

    public void b(int i10) {
        jni_java_finish_pointer(this.f64366c, i10);
    }

    public void b(int i10, float f10, float f11) {
        jni_java_accumulate_and_finish_pointer(this.f64366c, i10, f10, f11);
    }

    public void b(long j10) {
        jni_java_webview_message(this.f64366c, j10, 2, 0, 0, null);
    }

    public void b(String str) {
        jni_java_json_api(this.f64366c, str);
    }

    public void b(boolean z10) {
        jni_java_keyboard_visibility_change_event(this.f64366c, z10);
    }

    public void c() {
        jni_java_unpause(this.f64366c);
    }

    public boolean c(String str) {
        return jni_java_is_url_allowlisted(this.f64366c, str);
    }

    public int d(String str) {
        return jni_java_record_string(this.f64366c, str);
    }

    public void d() {
        FS.__clearSession();
        jni_java_shutdown(this.f64366c);
    }

    public void e() {
        jni_java_restart(this.f64366c);
    }

    public void e(String str) {
        jni_java_send_internal_message(this.f64366c, str);
    }

    public int f() {
        return jni_java_get_webview_api_msg_type();
    }

    public void g() {
        jni_java_finish_all_pointers(this.f64366c);
    }

    public void h() {
        jni_java_user_activity_event(this.f64366c);
    }
}
