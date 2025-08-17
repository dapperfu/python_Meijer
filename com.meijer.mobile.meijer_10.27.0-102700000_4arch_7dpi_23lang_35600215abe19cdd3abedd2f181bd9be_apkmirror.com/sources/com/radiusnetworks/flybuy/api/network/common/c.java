package com.radiusnetworks.flybuy.api.network.common;

import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ApiSuccessResponse f119919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ApiSuccessResponse apiSuccessResponse) {
        super(0);
        this.f119919f = apiSuccessResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f119919f.getLinks().get("next");
        if (str == null) {
            return null;
        }
        Matcher matcher = ApiSuccessResponse.PAGE_PATTERN.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
