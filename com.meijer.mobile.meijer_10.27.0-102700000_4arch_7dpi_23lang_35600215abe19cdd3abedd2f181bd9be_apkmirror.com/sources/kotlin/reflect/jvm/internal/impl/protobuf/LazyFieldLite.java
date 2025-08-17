package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes13.dex */
public class LazyFieldLite {

    /* renamed from: a, reason: collision with root package name */
    private ByteString f145880a;

    /* renamed from: b, reason: collision with root package name */
    private ExtensionRegistryLite f145881b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f145882c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile MessageLite f145883d;

    protected void a(MessageLite messageLite) {
        if (this.f145883d != null) {
            return;
        }
        synchronized (this) {
            if (this.f145883d != null) {
                return;
            }
            try {
                if (this.f145880a != null) {
                    this.f145883d = messageLite.f().b(this.f145880a, this.f145881b);
                } else {
                    this.f145883d = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f145882c ? this.f145883d.c() : this.f145880a.size();
    }

    public MessageLite d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f145883d;
        this.f145883d = messageLite;
        this.f145880a = null;
        this.f145882c = true;
        return messageLite2;
    }

    public MessageLite c(MessageLite messageLite) {
        a(messageLite);
        return this.f145883d;
    }
}
