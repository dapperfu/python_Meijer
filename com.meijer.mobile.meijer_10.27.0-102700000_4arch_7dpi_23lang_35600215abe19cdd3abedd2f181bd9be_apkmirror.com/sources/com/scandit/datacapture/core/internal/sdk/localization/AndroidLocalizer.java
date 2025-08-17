package com.scandit.datacapture.core.internal.sdk.localization;

import android.content.Context;
import android.content.res.Resources;
import com.scandit.datacapture.core.internal.sdk.utils.ResourceResolver;
import com.scandit.internal.sdk.bar.Localizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/localization/AndroidLocalizer;", "Lcom/scandit/internal/sdk/bar/Localizer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "defaultLocalizer", "getLocalizedString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AndroidLocalizer extends Localizer {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f125505a;

    public AndroidLocalizer(Context context) {
        Intrinsics.j(context, "context");
        this.f125505a = context.getResources();
    }

    @Override // com.scandit.internal.sdk.bar.Localizer
    public String getLocalizedString(String key, String defaultLocalizer) throws Resources.NotFoundException {
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultLocalizer, "defaultLocalizer");
        int stringResIdentifier = ResourceResolver.INSTANCE.getStringResIdentifier(key);
        if (stringResIdentifier == 0) {
            return defaultLocalizer;
        }
        String string = this.f125505a.getString(stringResIdentifier);
        Intrinsics.g(string);
        return string;
    }
}
