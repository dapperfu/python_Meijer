package Uv;

import gw.C14419h;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"LUv/c;", "", "Lgw/h;", "name", "value", "<init>", "(Lgw/h;Lgw/h;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lgw/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "()Lgw/h;", "b", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgw/h;", "c", "I", "hpackSize", "d", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final C14419h f39057e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final C14419h f39058f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final C14419h f39059g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final C14419h f39060h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final C14419h f39061i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final C14419h f39062j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C14419h name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C14419h value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int hpackSize;

    public c(C14419h name, C14419h value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.V() + 32 + value.V();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.e(this.name, cVar.name) && Intrinsics.e(this.value, cVar.value);
    }

    static {
        C14419h.Companion companion = C14419h.INSTANCE;
        f39057e = companion.d(":");
        f39058f = companion.d(":status");
        f39059g = companion.d(":method");
        f39060h = companion.d(":path");
        f39061i = companion.d(":scheme");
        f39062j = companion.d(":authority");
    }

    /* renamed from: a, reason: from getter */
    public final C14419h getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final C14419h getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.c0() + ": " + this.value.c0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        C14419h.Companion companion = C14419h.INSTANCE;
        this(companion.d(name), companion.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(C14419h name, String value) {
        this(name, C14419h.INSTANCE.d(value));
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
    }
}
