package com.meijer.mobile.weeklyad.services.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\bF\b\u0081\b\u0018\u00002\u00020\u0001B¿\u0004\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0003\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00103\u001a\u000202\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104¢\u0006\u0004\b7\u00108JÈ\u0004\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010(\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010!2\u0010\b\u0003\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00103\u001a\u0002022\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u0002022\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010<R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010<R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bH\u0010<R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bS\u0010<R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010<R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\bW\u0010<R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bM\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bG\u0010K\u001a\u0004\bO\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bI\u0010K\u001a\u0004\bP\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bR\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bY\u0010K\u001a\u0004\bB\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\bZ\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b_\u0010K\u001a\u0004\b`\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\ba\u0010K\u001a\u0004\bb\u0010<R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bF\u0010eR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bJ\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bf\u0010K\u001a\u0004\bf\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bg\u0010K\u001a\u0004\bh\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\ba\u0010<R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bj\u0010K\u001a\u0004\b]\u0010<R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bk\u0010K\u001a\u0004\bl\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bm\u0010K\u001a\u0004\bT\u0010<R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\b_\u0010pR\u0019\u0010#\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bU\u0010o\u001a\u0004\bq\u0010pR\u0019\u0010$\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b^\u0010o\u001a\u0004\br\u0010pR\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bZ\u0010o\u001a\u0004\bX\u0010pR\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b[\u0010ER\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bg\u0010ER\u0019\u0010(\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bN\u0010o\u001a\u0004\bn\u0010pR\u0019\u0010)\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bW\u0010o\u001a\u0004\bj\u0010pR\u0019\u0010*\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bh\u0010o\u001a\u0004\bk\u0010pR\u0019\u0010+\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bq\u0010o\u001a\u0004\bm\u0010pR\u001f\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b`\u0010d\u001a\u0004\bY\u0010eR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bi\u0010ER\u0019\u0010.\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bs\u0010K\u001a\u0004\bV\u0010<R\u0019\u0010/\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bt\u0010K\u001a\u0004\bu\u0010<R\u0019\u00100\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bu\u0010K\u001a\u0004\bt\u0010<R\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bs\u0010ER\"\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010v\u001a\u0004\b3\u0010w\"\u0004\bx\u0010yR\u001f\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006¢\u0006\f\n\u0004\bz\u0010d\u001a\u0004\bc\u0010e¨\u0006{"}, d2 = {"Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJson;", "", "", "itemId", "flyerId", "flyerRunId", "", "productName", "saleStory", "currentPrice", "originalPrice", "dollarsOff", "percentOff", "sku", "customIdField1", "customIdField2", "customIdField3", "description", "brand", "prePriceText", "priceText", "postPriceText", "validFrom", "validTo", "", "categories", "currentPriceRange", "originalPriceRange", "smallImageUrl", "mediumImageUrl", "largeImageUrl", "xLargeImageUrl", "detailImageUrl", "", "left", "top", "width", "height", "itemType", "page", "pageWidth", "pageHeight", "pageRelativeLeftOffset", "pageRelativeTopOffset", "images", "pageDestination", "disclaimerText", "webUrl", "videoUrl", "videoType", "", "isAddedToShoppingList", "", "", "meijerOfferIdsList", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/util/List;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/util/List;)Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "p", "()Ljava/lang/Integer;", "b", "l", "c", "m", "d", "Ljava/lang/String;", "H", "e", "I", "f", "g", "v", "h", "k", "i", "D", "j", "J", "n", "o", "F", "q", "G", "r", "E", "s", "M", "t", "N", "u", "Ljava/util/List;", "()Ljava/util/List;", "w", "x", "K", "y", "z", "A", "S", "B", "C", "Ljava/lang/Float;", "()Ljava/lang/Float;", "L", "R", "O", "P", "Q", "Z", "()Z", "setAddedToShoppingList", "(Z)V", "T", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FlippWeeklyAdItemJson {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String xLargeImageUrl;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final String detailImageUrl;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float left;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float top;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float width;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float height;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer itemType;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer page;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pageWidth;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pageHeight;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pageRelativeLeftOffset;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pageRelativeTopOffset;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> images;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer pageDestination;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final String disclaimerText;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webUrl;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String videoUrl;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer videoType;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private transient boolean isAddedToShoppingList;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> meijerOfferIdsList;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer flyerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer flyerRunId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String saleStory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentPrice;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dollarsOff;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String percentOff;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sku;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customIdField1;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customIdField2;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customIdField3;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String brand;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String prePriceText;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceText;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postPriceText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validFrom;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validTo;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> categories;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentPriceRange;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalPriceRange;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String smallImageUrl;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mediumImageUrl;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String largeImageUrl;

    public FlippWeeklyAdItemJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, -1, 16383, null);
    }

    public final FlippWeeklyAdItemJson copy(@g(name = PreferencesHelper.PREF_ID) Integer itemId, @g(name = "flyer_id") Integer flyerId, @g(name = "flyer_run_id") Integer flyerRunId, @g(name = "name") String productName, @g(name = "sale_story") String saleStory, @g(name = "current_price") String currentPrice, @g(name = "original_price") String originalPrice, @g(name = "dollars_off") String dollarsOff, @g(name = "percent_off") String percentOff, @g(name = "sku") String sku, @g(name = "custom_id_field_1") String customIdField1, @g(name = "custom_id_field_2") String customIdField2, @g(name = "custom_id_field_3") String customIdField3, @g(name = "description") String description, @g(name = "brand") String brand, @g(name = "pre_price_text") String prePriceText, @g(name = "price_text") String priceText, @g(name = "post_price_text") String postPriceText, @g(name = "valid_from") String validFrom, @g(name = "valid_to") String validTo, @g(name = "categories") List<String> categories, @g(name = "current_price_range") String currentPriceRange, @g(name = "original_price_range") String originalPriceRange, @g(name = "small_image_url") String smallImageUrl, @g(name = "medium_image_url") String mediumImageUrl, @g(name = "large_image_url") String largeImageUrl, @g(name = "x_large_image_url") String xLargeImageUrl, @g(name = "image_url") String detailImageUrl, @g(name = "left") Float left, @g(name = "top") Float top, @g(name = "width") Float width, @g(name = "height") Float height, @g(name = "item_type") Integer itemType, @g(name = "page") Integer page, @g(name = "page_width") Float pageWidth, @g(name = "page_height") Float pageHeight, @g(name = "page_relative_left_offset") Float pageRelativeLeftOffset, @g(name = "page_relative_top_offset") Float pageRelativeTopOffset, @g(name = "images") List<String> images, @g(name = "page_destination") Integer pageDestination, @g(name = "disclaimer_text") String disclaimerText, @g(name = "web_url") String webUrl, @g(name = "video_url") String videoUrl, @g(name = "video_type") Integer videoType, boolean isAddedToShoppingList, List<Long> meijerOfferIdsList) {
        return new FlippWeeklyAdItemJson(itemId, flyerId, flyerRunId, productName, saleStory, currentPrice, originalPrice, dollarsOff, percentOff, sku, customIdField1, customIdField2, customIdField3, description, brand, prePriceText, priceText, postPriceText, validFrom, validTo, categories, currentPriceRange, originalPriceRange, smallImageUrl, mediumImageUrl, largeImageUrl, xLargeImageUrl, detailImageUrl, left, top, width, height, itemType, page, pageWidth, pageHeight, pageRelativeLeftOffset, pageRelativeTopOffset, images, pageDestination, disclaimerText, webUrl, videoUrl, videoType, isAddedToShoppingList, meijerOfferIdsList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlippWeeklyAdItemJson)) {
            return false;
        }
        FlippWeeklyAdItemJson flippWeeklyAdItemJson = (FlippWeeklyAdItemJson) other;
        return Intrinsics.e(this.itemId, flippWeeklyAdItemJson.itemId) && Intrinsics.e(this.flyerId, flippWeeklyAdItemJson.flyerId) && Intrinsics.e(this.flyerRunId, flippWeeklyAdItemJson.flyerRunId) && Intrinsics.e(this.productName, flippWeeklyAdItemJson.productName) && Intrinsics.e(this.saleStory, flippWeeklyAdItemJson.saleStory) && Intrinsics.e(this.currentPrice, flippWeeklyAdItemJson.currentPrice) && Intrinsics.e(this.originalPrice, flippWeeklyAdItemJson.originalPrice) && Intrinsics.e(this.dollarsOff, flippWeeklyAdItemJson.dollarsOff) && Intrinsics.e(this.percentOff, flippWeeklyAdItemJson.percentOff) && Intrinsics.e(this.sku, flippWeeklyAdItemJson.sku) && Intrinsics.e(this.customIdField1, flippWeeklyAdItemJson.customIdField1) && Intrinsics.e(this.customIdField2, flippWeeklyAdItemJson.customIdField2) && Intrinsics.e(this.customIdField3, flippWeeklyAdItemJson.customIdField3) && Intrinsics.e(this.description, flippWeeklyAdItemJson.description) && Intrinsics.e(this.brand, flippWeeklyAdItemJson.brand) && Intrinsics.e(this.prePriceText, flippWeeklyAdItemJson.prePriceText) && Intrinsics.e(this.priceText, flippWeeklyAdItemJson.priceText) && Intrinsics.e(this.postPriceText, flippWeeklyAdItemJson.postPriceText) && Intrinsics.e(this.validFrom, flippWeeklyAdItemJson.validFrom) && Intrinsics.e(this.validTo, flippWeeklyAdItemJson.validTo) && Intrinsics.e(this.categories, flippWeeklyAdItemJson.categories) && Intrinsics.e(this.currentPriceRange, flippWeeklyAdItemJson.currentPriceRange) && Intrinsics.e(this.originalPriceRange, flippWeeklyAdItemJson.originalPriceRange) && Intrinsics.e(this.smallImageUrl, flippWeeklyAdItemJson.smallImageUrl) && Intrinsics.e(this.mediumImageUrl, flippWeeklyAdItemJson.mediumImageUrl) && Intrinsics.e(this.largeImageUrl, flippWeeklyAdItemJson.largeImageUrl) && Intrinsics.e(this.xLargeImageUrl, flippWeeklyAdItemJson.xLargeImageUrl) && Intrinsics.e(this.detailImageUrl, flippWeeklyAdItemJson.detailImageUrl) && Intrinsics.e(this.left, flippWeeklyAdItemJson.left) && Intrinsics.e(this.top, flippWeeklyAdItemJson.top) && Intrinsics.e(this.width, flippWeeklyAdItemJson.width) && Intrinsics.e(this.height, flippWeeklyAdItemJson.height) && Intrinsics.e(this.itemType, flippWeeklyAdItemJson.itemType) && Intrinsics.e(this.page, flippWeeklyAdItemJson.page) && Intrinsics.e(this.pageWidth, flippWeeklyAdItemJson.pageWidth) && Intrinsics.e(this.pageHeight, flippWeeklyAdItemJson.pageHeight) && Intrinsics.e(this.pageRelativeLeftOffset, flippWeeklyAdItemJson.pageRelativeLeftOffset) && Intrinsics.e(this.pageRelativeTopOffset, flippWeeklyAdItemJson.pageRelativeTopOffset) && Intrinsics.e(this.images, flippWeeklyAdItemJson.images) && Intrinsics.e(this.pageDestination, flippWeeklyAdItemJson.pageDestination) && Intrinsics.e(this.disclaimerText, flippWeeklyAdItemJson.disclaimerText) && Intrinsics.e(this.webUrl, flippWeeklyAdItemJson.webUrl) && Intrinsics.e(this.videoUrl, flippWeeklyAdItemJson.videoUrl) && Intrinsics.e(this.videoType, flippWeeklyAdItemJson.videoType) && this.isAddedToShoppingList == flippWeeklyAdItemJson.isAddedToShoppingList && Intrinsics.e(this.meijerOfferIdsList, flippWeeklyAdItemJson.meijerOfferIdsList);
    }

    public int hashCode() {
        Integer num = this.itemId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.flyerId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.flyerRunId;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.productName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.saleStory;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentPrice;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originalPrice;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dollarsOff;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.percentOff;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sku;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.customIdField1;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.customIdField2;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.customIdField3;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.description;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.brand;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.prePriceText;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.priceText;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.postPriceText;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.validFrom;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.validTo;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<String> list = this.categories;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        String str18 = this.currentPriceRange;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.originalPriceRange;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.smallImageUrl;
        int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.mediumImageUrl;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.largeImageUrl;
        int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.xLargeImageUrl;
        int iHashCode27 = (iHashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.detailImageUrl;
        int iHashCode28 = (iHashCode27 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Float f10 = this.left;
        int iHashCode29 = (iHashCode28 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.top;
        int iHashCode30 = (iHashCode29 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.width;
        int iHashCode31 = (iHashCode30 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.height;
        int iHashCode32 = (iHashCode31 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Integer num4 = this.itemType;
        int iHashCode33 = (iHashCode32 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.page;
        int iHashCode34 = (iHashCode33 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f14 = this.pageWidth;
        int iHashCode35 = (iHashCode34 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.pageHeight;
        int iHashCode36 = (iHashCode35 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.pageRelativeLeftOffset;
        int iHashCode37 = (iHashCode36 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.pageRelativeTopOffset;
        int iHashCode38 = (iHashCode37 + (f17 == null ? 0 : f17.hashCode())) * 31;
        List<String> list2 = this.images;
        int iHashCode39 = (iHashCode38 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.pageDestination;
        int iHashCode40 = (iHashCode39 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str25 = this.disclaimerText;
        int iHashCode41 = (iHashCode40 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.webUrl;
        int iHashCode42 = (iHashCode41 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.videoUrl;
        int iHashCode43 = (iHashCode42 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num7 = this.videoType;
        int iHashCode44 = (((iHashCode43 + (num7 == null ? 0 : num7.hashCode())) * 31) + Boolean.hashCode(this.isAddedToShoppingList)) * 31;
        List<Long> list3 = this.meijerOfferIdsList;
        return iHashCode44 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "FlippWeeklyAdItemJson(itemId=" + this.itemId + ", flyerId=" + this.flyerId + ", flyerRunId=" + this.flyerRunId + ", productName=" + this.productName + ", saleStory=" + this.saleStory + ", currentPrice=" + this.currentPrice + ", originalPrice=" + this.originalPrice + ", dollarsOff=" + this.dollarsOff + ", percentOff=" + this.percentOff + ", sku=" + this.sku + ", customIdField1=" + this.customIdField1 + ", customIdField2=" + this.customIdField2 + ", customIdField3=" + this.customIdField3 + ", description=" + this.description + ", brand=" + this.brand + ", prePriceText=" + this.prePriceText + ", priceText=" + this.priceText + ", postPriceText=" + this.postPriceText + ", validFrom=" + this.validFrom + ", validTo=" + this.validTo + ", categories=" + this.categories + ", currentPriceRange=" + this.currentPriceRange + ", originalPriceRange=" + this.originalPriceRange + ", smallImageUrl=" + this.smallImageUrl + ", mediumImageUrl=" + this.mediumImageUrl + ", largeImageUrl=" + this.largeImageUrl + ", xLargeImageUrl=" + this.xLargeImageUrl + ", detailImageUrl=" + this.detailImageUrl + ", left=" + this.left + ", top=" + this.top + ", width=" + this.width + ", height=" + this.height + ", itemType=" + this.itemType + ", page=" + this.page + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", pageRelativeLeftOffset=" + this.pageRelativeLeftOffset + ", pageRelativeTopOffset=" + this.pageRelativeTopOffset + ", images=" + this.images + ", pageDestination=" + this.pageDestination + ", disclaimerText=" + this.disclaimerText + ", webUrl=" + this.webUrl + ", videoUrl=" + this.videoUrl + ", videoType=" + this.videoType + ", isAddedToShoppingList=" + this.isAddedToShoppingList + ", meijerOfferIdsList=" + this.meijerOfferIdsList + ')';
    }

    public FlippWeeklyAdItemJson(@g(name = PreferencesHelper.PREF_ID) Integer num, @g(name = "flyer_id") Integer num2, @g(name = "flyer_run_id") Integer num3, @g(name = "name") String str, @g(name = "sale_story") String str2, @g(name = "current_price") String str3, @g(name = "original_price") String str4, @g(name = "dollars_off") String str5, @g(name = "percent_off") String str6, @g(name = "sku") String str7, @g(name = "custom_id_field_1") String str8, @g(name = "custom_id_field_2") String str9, @g(name = "custom_id_field_3") String str10, @g(name = "description") String str11, @g(name = "brand") String str12, @g(name = "pre_price_text") String str13, @g(name = "price_text") String str14, @g(name = "post_price_text") String str15, @g(name = "valid_from") String str16, @g(name = "valid_to") String str17, @g(name = "categories") List<String> list, @g(name = "current_price_range") String str18, @g(name = "original_price_range") String str19, @g(name = "small_image_url") String str20, @g(name = "medium_image_url") String str21, @g(name = "large_image_url") String str22, @g(name = "x_large_image_url") String str23, @g(name = "image_url") String str24, @g(name = "left") Float f10, @g(name = "top") Float f11, @g(name = "width") Float f12, @g(name = "height") Float f13, @g(name = "item_type") Integer num4, @g(name = "page") Integer num5, @g(name = "page_width") Float f14, @g(name = "page_height") Float f15, @g(name = "page_relative_left_offset") Float f16, @g(name = "page_relative_top_offset") Float f17, @g(name = "images") List<String> list2, @g(name = "page_destination") Integer num6, @g(name = "disclaimer_text") String str25, @g(name = "web_url") String str26, @g(name = "video_url") String str27, @g(name = "video_type") Integer num7, boolean z10, List<Long> list3) {
        this.itemId = num;
        this.flyerId = num2;
        this.flyerRunId = num3;
        this.productName = str;
        this.saleStory = str2;
        this.currentPrice = str3;
        this.originalPrice = str4;
        this.dollarsOff = str5;
        this.percentOff = str6;
        this.sku = str7;
        this.customIdField1 = str8;
        this.customIdField2 = str9;
        this.customIdField3 = str10;
        this.description = str11;
        this.brand = str12;
        this.prePriceText = str13;
        this.priceText = str14;
        this.postPriceText = str15;
        this.validFrom = str16;
        this.validTo = str17;
        this.categories = list;
        this.currentPriceRange = str18;
        this.originalPriceRange = str19;
        this.smallImageUrl = str20;
        this.mediumImageUrl = str21;
        this.largeImageUrl = str22;
        this.xLargeImageUrl = str23;
        this.detailImageUrl = str24;
        this.left = f10;
        this.top = f11;
        this.width = f12;
        this.height = f13;
        this.itemType = num4;
        this.page = num5;
        this.pageWidth = f14;
        this.pageHeight = f15;
        this.pageRelativeLeftOffset = f16;
        this.pageRelativeTopOffset = f17;
        this.images = list2;
        this.pageDestination = num6;
        this.disclaimerText = str25;
        this.webUrl = str26;
        this.videoUrl = str27;
        this.videoType = num7;
        this.isAddedToShoppingList = z10;
        this.meijerOfferIdsList = list3;
    }

    /* renamed from: A, reason: from getter */
    public final Float getPageRelativeLeftOffset() {
        return this.pageRelativeLeftOffset;
    }

    /* renamed from: B, reason: from getter */
    public final Float getPageRelativeTopOffset() {
        return this.pageRelativeTopOffset;
    }

    /* renamed from: C, reason: from getter */
    public final Float getPageWidth() {
        return this.pageWidth;
    }

    /* renamed from: D, reason: from getter */
    public final String getPercentOff() {
        return this.percentOff;
    }

    /* renamed from: E, reason: from getter */
    public final String getPostPriceText() {
        return this.postPriceText;
    }

    /* renamed from: F, reason: from getter */
    public final String getPrePriceText() {
        return this.prePriceText;
    }

    /* renamed from: G, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    /* renamed from: H, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: I, reason: from getter */
    public final String getSaleStory() {
        return this.saleStory;
    }

    /* renamed from: J, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: K, reason: from getter */
    public final String getSmallImageUrl() {
        return this.smallImageUrl;
    }

    /* renamed from: L, reason: from getter */
    public final Float getTop() {
        return this.top;
    }

    /* renamed from: M, reason: from getter */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* renamed from: N, reason: from getter */
    public final String getValidTo() {
        return this.validTo;
    }

    /* renamed from: O, reason: from getter */
    public final Integer getVideoType() {
        return this.videoType;
    }

    /* renamed from: P, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: Q, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* renamed from: R, reason: from getter */
    public final Float getWidth() {
        return this.width;
    }

    /* renamed from: S, reason: from getter */
    public final String getXLargeImageUrl() {
        return this.xLargeImageUrl;
    }

    /* renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    public final List<String> b() {
        return this.categories;
    }

    /* renamed from: c, reason: from getter */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* renamed from: d, reason: from getter */
    public final String getCurrentPriceRange() {
        return this.currentPriceRange;
    }

    /* renamed from: e, reason: from getter */
    public final String getCustomIdField1() {
        return this.customIdField1;
    }

    /* renamed from: f, reason: from getter */
    public final String getCustomIdField2() {
        return this.customIdField2;
    }

    /* renamed from: g, reason: from getter */
    public final String getCustomIdField3() {
        return this.customIdField3;
    }

    /* renamed from: h, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: i, reason: from getter */
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    /* renamed from: j, reason: from getter */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    /* renamed from: k, reason: from getter */
    public final String getDollarsOff() {
        return this.dollarsOff;
    }

    /* renamed from: l, reason: from getter */
    public final Integer getFlyerId() {
        return this.flyerId;
    }

    /* renamed from: m, reason: from getter */
    public final Integer getFlyerRunId() {
        return this.flyerRunId;
    }

    /* renamed from: n, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    public final List<String> o() {
        return this.images;
    }

    /* renamed from: p, reason: from getter */
    public final Integer getItemId() {
        return this.itemId;
    }

    /* renamed from: q, reason: from getter */
    public final Integer getItemType() {
        return this.itemType;
    }

    /* renamed from: r, reason: from getter */
    public final String getLargeImageUrl() {
        return this.largeImageUrl;
    }

    /* renamed from: s, reason: from getter */
    public final Float getLeft() {
        return this.left;
    }

    /* renamed from: t, reason: from getter */
    public final String getMediumImageUrl() {
        return this.mediumImageUrl;
    }

    public final List<Long> u() {
        return this.meijerOfferIdsList;
    }

    /* renamed from: v, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    /* renamed from: w, reason: from getter */
    public final String getOriginalPriceRange() {
        return this.originalPriceRange;
    }

    /* renamed from: x, reason: from getter */
    public final Integer getPage() {
        return this.page;
    }

    /* renamed from: y, reason: from getter */
    public final Integer getPageDestination() {
        return this.pageDestination;
    }

    /* renamed from: z, reason: from getter */
    public final Float getPageHeight() {
        return this.pageHeight;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FlippWeeklyAdItemJson(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Float f10, Float f11, Float f12, Float f13, Integer num4, Integer num5, Float f14, Float f15, Float f16, Float f17, List list2, Integer num6, String str25, String str26, String str27, Integer num7, boolean z10, List list3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num8 = (i10 & 1) != 0 ? null : num;
        this(num8, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str9, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str10, (i10 & 8192) != 0 ? null : str11, (i10 & 16384) != 0 ? null : str12, (i10 & 32768) != 0 ? null : str13, (i10 & 65536) != 0 ? null : str14, (i10 & 131072) != 0 ? null : str15, (i10 & 262144) != 0 ? null : str16, (i10 & 524288) != 0 ? null : str17, (i10 & 1048576) != 0 ? null : list, (i10 & 2097152) != 0 ? null : str18, (i10 & 4194304) != 0 ? null : str19, (i10 & 8388608) != 0 ? null : str20, (i10 & 16777216) != 0 ? null : str21, (i10 & 33554432) != 0 ? null : str22, (i10 & 67108864) != 0 ? null : str23, (i10 & 134217728) != 0 ? null : str24, (i10 & 268435456) != 0 ? null : f10, (i10 & 536870912) != 0 ? null : f11, (i10 & 1073741824) != 0 ? null : f12, (i10 & Integer.MIN_VALUE) != 0 ? null : f13, (i11 & 1) != 0 ? null : num4, (i11 & 2) != 0 ? null : num5, (i11 & 4) != 0 ? null : f14, (i11 & 8) != 0 ? null : f15, (i11 & 16) != 0 ? null : f16, (i11 & 32) != 0 ? null : f17, (i11 & 64) != 0 ? null : list2, (i11 & 128) != 0 ? null : num6, (i11 & 256) != 0 ? null : str25, (i11 & 512) != 0 ? null : str26, (i11 & 1024) != 0 ? null : str27, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num7, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z10, (i11 & 8192) != 0 ? new ArrayList() : list3);
    }
}
