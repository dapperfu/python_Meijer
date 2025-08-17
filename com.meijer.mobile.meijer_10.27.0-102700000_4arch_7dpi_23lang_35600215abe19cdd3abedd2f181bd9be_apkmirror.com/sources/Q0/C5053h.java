package Q0;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "LQ0/K;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(LQ0/K;)Ljava/lang/String;", "getAndroidType$annotations", "(LQ0/K;)V", "androidType", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Q0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5053h {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<K, String> f29493a = MapsKt.m(TuplesKt.a(K.f29400a, "emailAddress"), TuplesKt.a(K.f29401b, "username"), TuplesKt.a(K.f29402c, "password"), TuplesKt.a(K.f29403d, "newUsername"), TuplesKt.a(K.f29404e, "newPassword"), TuplesKt.a(K.f29405f, "postalAddress"), TuplesKt.a(K.f29406g, "postalCode"), TuplesKt.a(K.f29407h, "creditCardNumber"), TuplesKt.a(K.f29408i, "creditCardSecurityCode"), TuplesKt.a(K.f29409j, "creditCardExpirationDate"), TuplesKt.a(K.f29410k, "creditCardExpirationMonth"), TuplesKt.a(K.f29411l, "creditCardExpirationYear"), TuplesKt.a(K.f29412m, "creditCardExpirationDay"), TuplesKt.a(K.f29413n, "addressCountry"), TuplesKt.a(K.f29414o, "addressRegion"), TuplesKt.a(K.f29415p, "addressLocality"), TuplesKt.a(K.f29416q, "streetAddress"), TuplesKt.a(K.f29417r, "extendedAddress"), TuplesKt.a(K.f29418s, "extendedPostalCode"), TuplesKt.a(K.f29419t, "personName"), TuplesKt.a(K.f29420u, "personGivenName"), TuplesKt.a(K.f29421v, "personFamilyName"), TuplesKt.a(K.f29422w, "personMiddleName"), TuplesKt.a(K.f29423x, "personMiddleInitial"), TuplesKt.a(K.f29424y, "personNamePrefix"), TuplesKt.a(K.f29425z, "personNameSuffix"), TuplesKt.a(K.f29388A, "phoneNumber"), TuplesKt.a(K.f29389B, "phoneNumberDevice"), TuplesKt.a(K.f29390C, "phoneCountryCode"), TuplesKt.a(K.f29391D, "phoneNational"), TuplesKt.a(K.f29392E, "gender"), TuplesKt.a(K.f29393F, "birthDateFull"), TuplesKt.a(K.f29394G, "birthDateDay"), TuplesKt.a(K.f29395H, "birthDateMonth"), TuplesKt.a(K.f29396I, "birthDateYear"), TuplesKt.a(K.f29397J, "smsOTPCode"));

    public static final String a(K k10) {
        String str = f29493a.get(k10);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
