package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;", "", "backgroundColor", "", "getBackgroundColor", "()I", "cardHeight", "getCardHeight", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "errorColor", "getErrorColor", "iconRes", "getIconRes", "()Ljava/lang/Integer;", "itemId", "getItemId", "showError", "", "getShowError", "()Z", "title", "getTitle", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/EditableCardData;", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/TextCardData;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CardData {
    int getBackgroundColor();

    int getCardHeight();

    String getContentDescription();

    int getErrorColor();

    Integer getIconRes();

    String getItemId();

    boolean getShowError();

    String getTitle();
}
