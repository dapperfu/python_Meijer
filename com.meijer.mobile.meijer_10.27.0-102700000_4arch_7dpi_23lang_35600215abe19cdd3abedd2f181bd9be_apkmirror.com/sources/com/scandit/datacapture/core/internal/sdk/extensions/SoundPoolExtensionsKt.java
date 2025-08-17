package com.scandit.datacapture.core.internal.sdk.extensions;

import android.content.Context;
import android.media.SoundPool;
import com.scandit.datacapture.core.common.feedback.AssetSound;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Sound;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b*\f\b\u0000\u0010\t\"\u00020\u00052\u00020\u0005¨\u0006\n"}, d2 = {"Landroid/media/SoundPool;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "sound", "", "Lcom/scandit/datacapture/core/internal/sdk/extensions/SoundId;", "load", "(Landroid/media/SoundPool;Landroid/content/Context;Lcom/scandit/datacapture/core/common/feedback/Sound;)I", "SoundId", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SoundPoolExtensionsKt {
    public static final int load(SoundPool soundPool, Context context, Sound sound) {
        Intrinsics.j(soundPool, "<this>");
        Intrinsics.j(context, "context");
        Intrinsics.j(sound, "sound");
        if (sound instanceof ResourceSound) {
            ResourceSound resourceSound = (ResourceSound) sound;
            if (resourceSound.getResourceId() != 0) {
                return soundPool.load(context, resourceSound.getResourceId(), 1);
            }
            return 0;
        }
        if (!(sound instanceof AssetSound)) {
            throw new NoWhenBranchMatchedException();
        }
        AssetSound assetSound = (AssetSound) sound;
        String str = (String) CollectionsKt.s0(StringsKt.a1(assetSound.getAssetName(), new String[]{"."}, false, 0, 6, null));
        int resourceByName = ContextExtensionsKt.getResourceByName(context, str);
        if (resourceByName <= 0 && !StringsKt.W(str, "sc_", false, 2, null)) {
            resourceByName = ContextExtensionsKt.getResourceByName(context, "sc_" + str);
        }
        return resourceByName > 0 ? soundPool.load(context, resourceByName, 1) : soundPool.load(ContextExtensionsKt.openAssetFd(context, assetSound.getAssetName()), 1);
    }
}
