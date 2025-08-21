package l9;

import H9.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00038\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll9/b;", "", "LH9/l;", "", "serviceUrlStorage", "defaultEndpoint", "<init>", "(LH9/l;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "LH9/l;", "b", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: l9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15476b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<String> serviceUrlStorage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String defaultEndpoint;

    public C15476b(l<String> serviceUrlStorage, String defaultEndpoint) {
        Intrinsics.j(serviceUrlStorage, "serviceUrlStorage");
        Intrinsics.j(defaultEndpoint, "defaultEndpoint");
        this.serviceUrlStorage = serviceUrlStorage;
        this.defaultEndpoint = defaultEndpoint;
    }

    public String a() {
        String str = this.serviceUrlStorage.get();
        return str == null ? this.defaultEndpoint : str;
    }
}
