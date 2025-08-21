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
public final class C4651h {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<K, String> f27506a = MapsKt.m(TuplesKt.a(K.f27413a, "emailAddress"), TuplesKt.a(K.f27414b, "username"), TuplesKt.a(K.f27415c, "password"), TuplesKt.a(K.f27416d, "newUsername"), TuplesKt.a(K.f27417e, "newPassword"), TuplesKt.a(K.f27418f, "postalAddress"), TuplesKt.a(K.f27419g, "postalCode"), TuplesKt.a(K.f27420h, "creditCardNumber"), TuplesKt.a(K.f27421i, "creditCardSecurityCode"), TuplesKt.a(K.f27422j, "creditCardExpirationDate"), TuplesKt.a(K.f27423k, "creditCardExpirationMonth"), TuplesKt.a(K.f27424l, "creditCardExpirationYear"), TuplesKt.a(K.f27425m, "creditCardExpirationDay"), TuplesKt.a(K.f27426n, "addressCountry"), TuplesKt.a(K.f27427o, "addressRegion"), TuplesKt.a(K.f27428p, "addressLocality"), TuplesKt.a(K.f27429q, "streetAddress"), TuplesKt.a(K.f27430r, "extendedAddress"), TuplesKt.a(K.f27431s, "extendedPostalCode"), TuplesKt.a(K.f27432t, "personName"), TuplesKt.a(K.f27433u, "personGivenName"), TuplesKt.a(K.f27434v, "personFamilyName"), TuplesKt.a(K.f27435w, "personMiddleName"), TuplesKt.a(K.f27436x, "personMiddleInitial"), TuplesKt.a(K.f27437y, "personNamePrefix"), TuplesKt.a(K.f27438z, "personNameSuffix"), TuplesKt.a(K.f27401A, "phoneNumber"), TuplesKt.a(K.f27402B, "phoneNumberDevice"), TuplesKt.a(K.f27403C, "phoneCountryCode"), TuplesKt.a(K.f27404D, "phoneNational"), TuplesKt.a(K.f27405E, "gender"), TuplesKt.a(K.f27406F, "birthDateFull"), TuplesKt.a(K.f27407G, "birthDateDay"), TuplesKt.a(K.f27408H, "birthDateMonth"), TuplesKt.a(K.f27409I, "birthDateYear"), TuplesKt.a(K.f27410J, "smsOTPCode"));

    public static final String a(K k10) {
        String str = f27506a.get(k10);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
