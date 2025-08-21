package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes3.dex */
public final /* synthetic */ class B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserPrincipalLookupService f139206a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.f139206a;
        if (obj instanceof B) {
            obj = ((B) obj).f139206a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139206a.hashCode();
    }

    public B(UserPrincipalLookupService userPrincipalLookupService) {
        this.f139206a = userPrincipalLookupService;
    }
}
