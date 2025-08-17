package fsimpl;

import com.fullstory.FS;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;

/* renamed from: fsimpl.fc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14085fc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RustInterface f132247a;

    public C14085fc(RustInterface rustInterface) {
        this.f132247a = rustInterface;
    }

    private long java_create_scanner(byte[] bArr, String str, String str2, boolean z10) {
        try {
            InterfaceC14086fd interfaceC14086fdA = this.f132247a.f64365b.a(bArr, str, str2, z10);
            if (interfaceC14086fdA != null) {
                if (((InterfaceC14086fd) this.f132247a.f64364a.getAndSet(interfaceC14086fdA)) != null) {
                    Log.e("Scanner improperly set twice");
                }
                FS.__gotSession();
                return System.identityHashCode(this.f132247a.f64365b);
            }
        } catch (Exception e10) {
            this.f132247a.a(e10);
        }
        Log.e("Uh-oh: didn't create a scanner");
        return 0L;
    }

    private void java_destroy_scanner(long j10) {
        try {
            InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f132247a.f64364a.getAndSet(null);
            int iIdentityHashCode = System.identityHashCode(interfaceC14086fd);
            if (interfaceC14086fd == null) {
                Log.w("Destroy scanner called with no scanner to destroy.");
            } else if (iIdentityHashCode != j10) {
                Log.e("Destroy scanner called improperly: " + iIdentityHashCode + " vs " + j10);
            } else {
                interfaceC14086fd.c();
            }
        } catch (Exception e10) {
            this.f132247a.a(e10);
        }
    }

    public void java_async_http_request(long j10, String str, byte[] bArr, String str2, String str3, boolean z10, boolean z11) {
        try {
            this.f132247a.f64365b.a(j10, str, bArr, str2, str3, z10, z11);
        } catch (Exception e10) {
            Log.e("Exception in Rust http request callback", e10);
        }
    }

    public void java_consent_changed(boolean z10) {
        try {
            InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f132247a.f64364a.get();
            if (interfaceC14086fd == null) {
                Log.e("ScannerCallbacks was null");
            } else {
                interfaceC14086fd.b(z10);
            }
        } catch (Exception e10) {
            this.f132247a.a(e10);
        }
    }

    public boolean java_eval_webview_js(long j10, String str, String str2) {
        try {
            return this.f132247a.f64365b.a(j10, str, str2);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return false;
        }
    }

    public void java_fs_fatal(int i10, String str) {
        Bootstrap.fail(i10, str);
    }

    public void java_got_session(byte[] bArr, String str, String str2, boolean z10) {
        InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f132247a.f64364a.get();
        if (bArr == null || bArr.length == 0) {
            java_destroy_scanner(System.identityHashCode(interfaceC14086fd));
            return;
        }
        if (interfaceC14086fd != null) {
            java_destroy_scanner(System.identityHashCode(interfaceC14086fd));
        }
        java_create_scanner(bArr, str, str2, z10);
    }

    public void java_session_disabled(int i10, String str) {
        FS.__noSession(i10, str);
    }

    public String java_sync_read_config_key(String str) {
        try {
            return this.f132247a.f64365b.a(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return null;
        }
    }

    public boolean java_sync_read_config_key_bool(String str) {
        try {
            return this.f132247a.f64365b.b(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return false;
        }
    }

    public byte[] java_sync_read_config_key_buffer(String str) {
        try {
            return this.f132247a.f64365b.d(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return null;
        }
    }

    public int java_sync_read_config_key_i32(String str) {
        try {
            return this.f132247a.f64365b.c(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return 0;
        }
    }

    public String java_sync_read_key(String str) {
        try {
            return this.f132247a.f64365b.e(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return null;
        }
    }

    public Boolean java_sync_read_key_bool(String str) {
        try {
            return this.f132247a.f64365b.f(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return null;
        }
    }

    public Long java_sync_read_key_long(String str) {
        try {
            return this.f132247a.f64365b.g(str);
        } catch (Exception e10) {
            this.f132247a.a(e10);
            return null;
        }
    }

    public int java_sync_scan_ui(int i10, Object obj) {
        try {
            InterfaceC14086fd interfaceC14086fd = (InterfaceC14086fd) this.f132247a.f64364a.get();
            if (interfaceC14086fd != null) {
                return interfaceC14086fd.a(i10, obj);
            }
            Log.e("ScannerCallbacks was null");
            return -1;
        } catch (Exception e10) {
            Log.e("Exception in Rust UI scan callback", e10);
            return -1;
        }
    }

    public void java_sync_write_key(String str, String str2) {
        try {
            this.f132247a.f64365b.a(str, str2);
        } catch (Exception e10) {
            this.f132247a.a(e10);
        }
    }

    public void java_sync_write_key_bool(String str, Boolean bool) {
        try {
            this.f132247a.f64365b.a(str, bool);
        } catch (Exception e10) {
            this.f132247a.a(e10);
        }
    }

    public void java_sync_write_key_long(String str, Long l10) {
        try {
            this.f132247a.f64365b.a(str, l10);
        } catch (Exception e10) {
            this.f132247a.a(e10);
        }
    }
}
