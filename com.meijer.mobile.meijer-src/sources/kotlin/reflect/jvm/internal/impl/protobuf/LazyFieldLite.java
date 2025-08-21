package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes14.dex */
public class LazyFieldLite {

    /* renamed from: a, reason: collision with root package name */
    private ByteString f146787a;

    /* renamed from: b, reason: collision with root package name */
    private ExtensionRegistryLite f146788b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f146789c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile MessageLite f146790d;

    protected void a(MessageLite messageLite) {
        if (this.f146790d != null) {
            return;
        }
        synchronized (this) {
            if (this.f146790d != null) {
                return;
            }
            try {
                if (this.f146787a != null) {
                    this.f146790d = messageLite.f().b(this.f146787a, this.f146788b);
                } else {
                    this.f146790d = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f146789c ? this.f146790d.c() : this.f146787a.size();
    }

    public MessageLite d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f146790d;
        this.f146790d = messageLite;
        this.f146787a = null;
        this.f146789c = true;
        return messageLite2;
    }

    public MessageLite c(MessageLite messageLite) {
        a(messageLite);
        return this.f146790d;
    }
}
