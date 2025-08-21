package com.meijer.mobile.meijer.activity.enrollment.profile;

import Ik.Validation;
import Ik.c;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/a;", "", "T", "LJk/k;", "Lkotlin/reflect/KProperty0;", "LIk/b;", "field", "emailAddress", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "", "LIk/c;", "d", "()Ljava/util/List;", "f", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a<T extends String> extends Jk.k<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String emailAddress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(KProperty0<Validation<T>> field, String emailAddress) {
        super(field, null, 2, null);
        Intrinsics.j(field, "field");
        Intrinsics.j(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
    }

    @Override // Jk.k
    public List<Ik.c> d() {
        ArrayList arrayList = new ArrayList();
        T tI = i();
        if (tI == null || tI.length() <= 0) {
            arrayList.add(new c.Empty(getFieldName(), "Please enter a valid password."));
            return arrayList;
        }
        if (!new Regex("[a-zA-Z0-9\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\.]*").j(tI)) {
            arrayList.add(new c.Invalid(getFieldName(), null, "Password may include only these special characters: !@#$%^&*().", 2, null));
        }
        if (tI.length() > 15) {
            arrayList.add(new c.Invalid(getFieldName(), null, "This password is longer than 15 characters. Please enter a password between 8–15 characters.", 2, null));
        }
        if (tI.length() < 8) {
            arrayList.add(new c.Invalid(getFieldName(), null, "This password is shorter than 8 characters. Please enter a password between 8-15 characters.", 2, null));
        }
        if (this.emailAddress.length() > 0 && StringsKt.d0(tI, b.h(this.emailAddress), false, 2, null)) {
            arrayList.add(new c.Invalid(getFieldName(), null, "Password cannot include your email address.", 2, null));
        }
        if (!b.f(tI)) {
            arrayList.add(new c.Invalid(getFieldName(), null, "Password must include at least 1 number.", 2, null));
        }
        if (!b.g(tI)) {
            arrayList.add(new c.Invalid(getFieldName(), null, "Password must include at least 1 uppercase letter.", 2, null));
        }
        if (!b.e(tI)) {
            arrayList.add(new c.Invalid(getFieldName(), null, "Password must include at least 1 lowercase letter.", 2, null));
        }
        return arrayList;
    }
}
