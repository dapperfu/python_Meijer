package com.meijer.mobile.product.model.hybris.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.classification.HybrisClassification;
import com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabel;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisDiscount;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bU\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0004\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\f\b\u0003\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\t\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0003\u0010#\u001a\u00020\u0010\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0003\u0010%\u001a\u00020\u0002\u0012\b\b\u0003\u0010&\u001a\u00020\u0002\u0012\b\b\u0003\u0010'\u001a\u00020\u0010\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0003\u0010*\u001a\u00020(\u0012\b\b\u0003\u0010+\u001a\u00020\u0002\u0012\b\b\u0003\u0010,\u001a\u00020\u001a\u0012\b\b\u0003\u0010-\u001a\u00020\u0002\u0012\b\b\u0003\u0010.\u001a\u00020\u0002\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0003\u00101\u001a\u00020\u0002\u0012\b\b\u0003\u00103\u001a\u000202\u0012\b\b\u0003\u00104\u001a\u00020\u0002\u0012\b\b\u0003\u00106\u001a\u000205\u0012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0003\u0010<\u001a\u00020\u0002\u0012\n\b\u0003\u0010=\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0003\u0010>\u001a\u00020\u0002\u0012\n\b\u0003\u0010@\u001a\u0004\u0018\u00010?\u0012\n\b\u0003\u0010A\u001a\u0004\u0018\u00010(\u0012\u0014\b\u0003\u0010D\u001a\u000e\u0012\b\u0012\u00060Bj\u0002`C\u0018\u00010\t\u0012\b\b\u0003\u0010E\u001a\u00020\u0002\u0012\f\b\u0003\u0010G\u001a\u00060(j\u0002`F\u0012\b\b\u0003\u0010H\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\u0080\u0005\u0010K\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0003\u0010\f\u001a\u00020\u00022\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0003\u0010\u000f\u001a\u00020\u00022\f\b\u0003\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0015\u001a\u00020\u00102\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0017\u001a\u00020\u00102\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0003\u0010\u001c\u001a\u00020\u00022\b\b\u0003\u0010\u001d\u001a\u00020\u00102\b\b\u0003\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u001f\u001a\u00020\u00022\u000e\b\u0003\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\t2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010#\u001a\u00020\u00102\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010%\u001a\u00020\u00022\b\b\u0003\u0010&\u001a\u00020\u00022\b\b\u0003\u0010'\u001a\u00020\u00102\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0003\u0010*\u001a\u00020(2\b\b\u0003\u0010+\u001a\u00020\u00022\b\b\u0003\u0010,\u001a\u00020\u001a2\b\b\u0003\u0010-\u001a\u00020\u00022\b\b\u0003\u0010.\u001a\u00020\u00022\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u00101\u001a\u00020\u00022\b\b\u0003\u00103\u001a\u0002022\b\b\u0003\u00104\u001a\u00020\u00022\b\b\u0003\u00106\u001a\u0002052\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010<\u001a\u00020\u00022\n\b\u0003\u0010=\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010>\u001a\u00020\u00022\n\b\u0003\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0003\u0010A\u001a\u0004\u0018\u00010(2\u0014\b\u0003\u0010D\u001a\u000e\u0012\b\u0012\u00060Bj\u0002`C\u0018\u00010\t2\b\b\u0003\u0010E\u001a\u00020\u00022\f\b\u0003\u0010G\u001a\u00060(j\u0002`F2\b\b\u0003\u0010H\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020(HÖ\u0001¢\u0006\u0004\bO\u0010PJ\u001a\u0010R\u001a\u00020\u00022\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010U\u001a\u0004\bX\u0010WR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010WR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010WR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\bU\u0010WR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010U\u001a\u0004\b[\u0010WR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\\\u0010^R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b_\u0010WR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\b`\u0010^R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\ba\u0010WR\u001b\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bb\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bd\u0010c\u001a\u0004\bd\u0010NR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\be\u0010c\u001a\u0004\bf\u0010NR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bf\u0010c\u001a\u0004\bg\u0010NR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010U\u001a\u0004\bh\u0010WR\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bh\u0010c\u001a\u0004\bi\u0010NR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bk\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010U\u001a\u0004\bp\u0010WR\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bp\u0010c\u001a\u0004\bq\u0010NR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010U\u001a\u0004\br\u0010WR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010U\u001a\u0004\bs\u0010WR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0006¢\u0006\f\n\u0004\bs\u0010]\u001a\u0004\bt\u0010^R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bt\u0010c\u001a\u0004\bu\u0010NR\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bu\u0010c\u001a\u0004\bv\u0010NR\u0019\u0010$\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bv\u0010c\u001a\u0004\bw\u0010NR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u0010U\u001a\u0004\by\u0010WR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010U\u001a\u0004\bz\u0010WR\u0017\u0010'\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b{\u0010c\u001a\u0004\b|\u0010NR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bz\u0010}\u001a\u0004\b~\u0010\u007fR\u0019\u0010*\u001a\u00020(8\u0006¢\u0006\u000e\n\u0005\b|\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010PR\u0018\u0010+\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b~\u0010U\u001a\u0005\b\u0082\u0001\u0010WR\u0019\u0010,\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0084\u0001\u0010oR\u0019\u0010-\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010U\u001a\u0005\b\u0085\u0001\u0010WR\u0019\u0010.\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010U\u001a\u0005\b\u0086\u0001\u0010WR\u001a\u0010/\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010m\u001a\u0004\be\u0010oR\u001b\u00100\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010c\u001a\u0005\b\u0080\u0001\u0010NR\u0019\u00101\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010U\u001a\u0005\b\u0087\u0001\u0010WR\u001a\u00103\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010z\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u00104\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010U\u001a\u0005\b\u008b\u0001\u0010WR\u001b\u00106\u001a\u0002058\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u00107\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010c\u001a\u0005\b\u008f\u0001\u0010NR\u001b\u00108\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010c\u001a\u0005\b\u0088\u0001\u0010NR\u001b\u00109\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010c\u001a\u0005\b\u0090\u0001\u0010NR\u001b\u0010:\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010c\u001a\u0005\b\u0092\u0001\u0010NR\u001b\u0010;\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010c\u001a\u0005\b\u0093\u0001\u0010NR\u0019\u0010<\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010U\u001a\u0005\b\u0094\u0001\u0010WR\u001b\u0010=\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010c\u001a\u0005\b\u0095\u0001\u0010NR\u0019\u0010>\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010U\u001a\u0005\b\u0096\u0001\u0010WR\u001d\u0010@\u001a\u0004\u0018\u00010?8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0097\u0001\u001a\u0006\b\u0083\u0001\u0010\u0098\u0001R\u001a\u0010A\u001a\u0004\u0018\u00010(8\u0006¢\u0006\r\n\u0005\b\u0096\u0001\u0010}\u001a\u0004\b{\u0010\u007fR#\u0010D\u001a\u000e\u0012\b\u0012\u00060Bj\u0002`C\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bU\u0010]\u001a\u0004\bx\u0010^R\u0019\u0010E\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010U\u001a\u0005\b\u0099\u0001\u0010WR\u001d\u0010G\u001a\u00060(j\u0002`F8\u0006¢\u0006\u000e\n\u0005\by\u0010\u0080\u0001\u001a\u0005\b\u0091\u0001\u0010PR\u0019\u0010H\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010U\u001a\u0005\b\u009a\u0001\u0010W¨\u0006\u009b\u0001"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "", "", "ageRestricted", "alcohol", "alcoholRestricted", "availableForPickup", "isBopas", "buyable", "", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisCategory;", "categories", "chokingHazard", "Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassification;", "classifications", "clickAndCollect", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "countryOfOrigin", "description", "descriptiveFeatures", "disabled", "disclaimer", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;", "discount", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "discountedPrice", "displayable", "ean", "hasMPerksOffers", "homeDeliveryNotAvailable", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "images", "ingredients", "itemUnitOfMeasure", "manufacturer", "isMap", "meijerBrand", "name", "", "numberOfReviews", "orderQuantityInterval", "prepareItem", "price", "priceByWeight", "primaryUpcFlag", "depositPrice", "packageSize", "purchasable", "", "qtyIncrement", "sale", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "stockInfo", "summary", "priceUnit", "unit", "unitCode", "upcType", "isEbtProduct", "url", "validDates", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "nutritionLabel", "maxOrderQuantity", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "mPerksOfferIds", "isSponsoredCriteo", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "isSubscriptionAvailable", "<init>", "(ZZZZZZLjava/util/List;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZLjava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Integer;IZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;ZDZLcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;Ljava/lang/Integer;Ljava/util/List;ZIZ)V", "copy", "(ZZZZZZLjava/util/List;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZLjava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Integer;IZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;ZDZLcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;Ljava/lang/Integer;Ljava/util/List;ZIZ)Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "d", "e", "f", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "i", "j", "k", "Ljava/lang/String;", "l", "m", "n", "o", "p", "q", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;", "r", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisDiscount;", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "s", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "t", "u", "v", "w", "x", "y", "z", "B", "A", "b0", "D", "C", "E", "Ljava/lang/Integer;", "F", "()Ljava/lang/Integer;", "I", "H", "J", "G", "K", "L", "N", "O", "M", "P", "()D", "Q", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "R", "()Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "T", "U", "S", "V", "W", "a0", "X", "Y", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "()Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "c0", "d0", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisProduct {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMap;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean meijerBrand;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer numberOfReviews;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final int orderQuantityInterval;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean prepareItem;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice price;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean priceByWeight;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean primaryUpcFlag;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice depositPrice;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final String packageSize;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean purchasable;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final double qtyIncrement;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sale;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisStockInfo stockInfo;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final String summary;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceUnit;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitCode;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upcType;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEbtProduct;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean validDates;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisNutritionLabel nutritionLabel;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer maxOrderQuantity;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> mPerksOfferIds;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ageRestricted;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSponsoredCriteo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean alcohol;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean alcoholRestricted;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscriptionAvailable;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean availableForPickup;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopas;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean buyable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisCategory> categories;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean chokingHazard;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisClassification> classifications;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clickAndCollect;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryOfOrigin;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String descriptiveFeatures;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean disabled;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String disclaimer;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisDiscount discount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice discountedPrice;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayable;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ean;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMPerksOffers;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean homeDeliveryNotAvailable;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisImage> images;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ingredients;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemUnitOfMeasure;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String manufacturer;

    public HybrisProduct() {
        this(false, false, false, false, false, false, null, false, null, false, null, null, null, null, false, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, 0, false, null, false, false, null, null, false, 0.0d, false, null, null, null, null, null, null, false, null, false, null, null, null, false, 0, false, -1, 8388607, null);
    }

    public static /* synthetic */ HybrisProduct a(HybrisProduct hybrisProduct, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, boolean z16, List list2, boolean z17, String str, String str2, String str3, String str4, boolean z18, String str5, HybrisDiscount hybrisDiscount, HybrisPrice hybrisPrice, boolean z19, String str6, boolean z20, boolean z21, List list3, String str7, String str8, String str9, boolean z22, boolean z23, String str10, Integer num, int i10, boolean z24, HybrisPrice hybrisPrice2, boolean z25, boolean z26, HybrisPrice hybrisPrice3, String str11, boolean z27, double d10, boolean z28, HybrisStockInfo hybrisStockInfo, String str12, String str13, String str14, String str15, String str16, boolean z29, String str17, boolean z30, HybrisNutritionLabel hybrisNutritionLabel, Integer num2, List list4, boolean z31, int i11, boolean z32, int i12, int i13, Object obj) {
        boolean z33;
        boolean z34;
        double d11;
        boolean z35 = (i12 & 1) != 0 ? hybrisProduct.ageRestricted : z10;
        boolean z36 = (i12 & 2) != 0 ? hybrisProduct.alcohol : z11;
        boolean z37 = (i12 & 4) != 0 ? hybrisProduct.alcoholRestricted : z12;
        boolean z38 = (i12 & 8) != 0 ? hybrisProduct.availableForPickup : z13;
        boolean z39 = (i12 & 16) != 0 ? hybrisProduct.isBopas : z14;
        boolean z40 = (i12 & 32) != 0 ? hybrisProduct.buyable : z15;
        List list5 = (i12 & 64) != 0 ? hybrisProduct.categories : list;
        boolean z41 = (i12 & 128) != 0 ? hybrisProduct.chokingHazard : z16;
        List list6 = (i12 & 256) != 0 ? hybrisProduct.classifications : list2;
        boolean z42 = (i12 & 512) != 0 ? hybrisProduct.clickAndCollect : z17;
        String str18 = (i12 & 1024) != 0 ? hybrisProduct.code : str;
        String str19 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? hybrisProduct.countryOfOrigin : str2;
        String str20 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? hybrisProduct.description : str3;
        boolean z43 = z35;
        String str21 = (i12 & 8192) != 0 ? hybrisProduct.descriptiveFeatures : str4;
        boolean z44 = (i12 & 16384) != 0 ? hybrisProduct.disabled : z18;
        String str22 = (i12 & 32768) != 0 ? hybrisProduct.disclaimer : str5;
        HybrisDiscount hybrisDiscount2 = (i12 & 65536) != 0 ? hybrisProduct.discount : hybrisDiscount;
        HybrisPrice hybrisPrice4 = (i12 & 131072) != 0 ? hybrisProduct.discountedPrice : hybrisPrice;
        boolean z45 = (i12 & 262144) != 0 ? hybrisProduct.displayable : z19;
        String str23 = (i12 & 524288) != 0 ? hybrisProduct.ean : str6;
        boolean z46 = (i12 & 1048576) != 0 ? hybrisProduct.hasMPerksOffers : z20;
        boolean z47 = (i12 & 2097152) != 0 ? hybrisProduct.homeDeliveryNotAvailable : z21;
        List list7 = (i12 & 4194304) != 0 ? hybrisProduct.images : list3;
        String str24 = (i12 & 8388608) != 0 ? hybrisProduct.ingredients : str7;
        String str25 = (i12 & 16777216) != 0 ? hybrisProduct.itemUnitOfMeasure : str8;
        String str26 = (i12 & 33554432) != 0 ? hybrisProduct.manufacturer : str9;
        boolean z48 = (i12 & 67108864) != 0 ? hybrisProduct.isMap : z22;
        boolean z49 = (i12 & 134217728) != 0 ? hybrisProduct.meijerBrand : z23;
        String str27 = (i12 & 268435456) != 0 ? hybrisProduct.name : str10;
        Integer num3 = (i12 & 536870912) != 0 ? hybrisProduct.numberOfReviews : num;
        int i14 = (i12 & 1073741824) != 0 ? hybrisProduct.orderQuantityInterval : i10;
        boolean z50 = (i12 & Integer.MIN_VALUE) != 0 ? hybrisProduct.prepareItem : z24;
        HybrisPrice hybrisPrice5 = (i13 & 1) != 0 ? hybrisProduct.price : hybrisPrice2;
        boolean z51 = (i13 & 2) != 0 ? hybrisProduct.priceByWeight : z25;
        boolean z52 = (i13 & 4) != 0 ? hybrisProduct.primaryUpcFlag : z26;
        HybrisPrice hybrisPrice6 = (i13 & 8) != 0 ? hybrisProduct.depositPrice : hybrisPrice3;
        String str28 = (i13 & 16) != 0 ? hybrisProduct.packageSize : str11;
        boolean z53 = (i13 & 32) != 0 ? hybrisProduct.purchasable : z27;
        if ((i13 & 64) != 0) {
            z33 = z44;
            z34 = z36;
            d11 = hybrisProduct.qtyIncrement;
        } else {
            z33 = z44;
            z34 = z36;
            d11 = d10;
        }
        return hybrisProduct.copy(z43, z34, z37, z38, z39, z40, list5, z41, list6, z42, str18, str19, str20, str21, z33, str22, hybrisDiscount2, hybrisPrice4, z45, str23, z46, z47, list7, str24, str25, str26, z48, z49, str27, num3, i14, z50, hybrisPrice5, z51, z52, hybrisPrice6, str28, z53, d11, (i13 & 128) != 0 ? hybrisProduct.sale : z28, (i13 & 256) != 0 ? hybrisProduct.stockInfo : hybrisStockInfo, (i13 & 512) != 0 ? hybrisProduct.summary : str12, (i13 & 1024) != 0 ? hybrisProduct.priceUnit : str13, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? hybrisProduct.unit : str14, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? hybrisProduct.unitCode : str15, (i13 & 8192) != 0 ? hybrisProduct.upcType : str16, (i13 & 16384) != 0 ? hybrisProduct.isEbtProduct : z29, (i13 & 32768) != 0 ? hybrisProduct.url : str17, (i13 & 65536) != 0 ? hybrisProduct.validDates : z30, (i13 & 131072) != 0 ? hybrisProduct.nutritionLabel : hybrisNutritionLabel, (i13 & 262144) != 0 ? hybrisProduct.maxOrderQuantity : num2, (i13 & 524288) != 0 ? hybrisProduct.mPerksOfferIds : list4, (i13 & 1048576) != 0 ? hybrisProduct.isSponsoredCriteo : z31, (i13 & 2097152) != 0 ? hybrisProduct.storeId : i11, (i13 & 4194304) != 0 ? hybrisProduct.isSubscriptionAvailable : z32);
    }

    public final HybrisProduct copy(@g(name = "ageRestricted") boolean ageRestricted, @g(name = "alcohol") boolean alcohol, @g(name = "alcoholRestricted") boolean alcoholRestricted, @g(name = "availableForPickup") boolean availableForPickup, @g(name = "bopas") boolean isBopas, @g(name = "buyable") boolean buyable, @g(name = "categories") List<HybrisCategory> categories, @g(name = "chokingHazard") boolean chokingHazard, @g(name = "classifications") List<HybrisClassification> classifications, @g(name = "clickAndCollect") boolean clickAndCollect, @g(name = "code") String code, @g(name = "countryOfOrigin") String countryOfOrigin, @g(name = "description") String description, @g(name = "descriptiveFeatures") String descriptiveFeatures, @g(name = "disabled") boolean disabled, @g(name = "disclaimer") String disclaimer, @g(name = "discount") HybrisDiscount discount, @g(name = "discountedPrice") HybrisPrice discountedPrice, @g(name = "displayable") boolean displayable, @g(name = "ean") String ean, @g(name = "hasMPerks") boolean hasMPerksOffers, @g(name = "homeDeliveryNotAvailable") boolean homeDeliveryNotAvailable, @g(name = "images") List<HybrisImage> images, @g(name = "ingredients") String ingredients, @g(name = "itemUnitOfMeasure") String itemUnitOfMeasure, @g(name = "manufacturer") String manufacturer, @g(name = "map") boolean isMap, @g(name = "meijerBrand") boolean meijerBrand, @g(name = "name") String name, @g(name = "numberOfReviews") Integer numberOfReviews, @g(name = "orderQuantityInterval") int orderQuantityInterval, @g(name = "prepareItem") boolean prepareItem, @g(name = "price") HybrisPrice price, @g(name = "priceByWeight") boolean priceByWeight, @g(name = "primaryUpcFlag") boolean primaryUpcFlag, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "packageSize") String packageSize, @g(name = "purchasable") boolean purchasable, @g(name = "qtyIncrement") double qtyIncrement, @g(name = "sale") boolean sale, @g(name = "stock") HybrisStockInfo stockInfo, @g(name = "summary") String summary, @g(name = "priceUnit") String priceUnit, @g(name = "unit") String unit, @g(name = "unitCode") String unitCode, @g(name = "upcType") String upcType, @g(name = "ebtFoodstampable") boolean isEbtProduct, @g(name = "url") String url, @g(name = "validDates") boolean validDates, @g(name = "nutritionLabel") HybrisNutritionLabel nutritionLabel, @g(name = "maxOrderQuantity") Integer maxOrderQuantity, @g(name = "mperksOfferIds") List<Long> mPerksOfferIds, @g(name = "isCriteoSponsored") boolean isSponsoredCriteo, @g(name = "storeId") int storeId, @g(name = "subscriptionAvailable") boolean isSubscriptionAvailable) {
        Intrinsics.j(classifications, "classifications");
        Intrinsics.j(code, "code");
        Intrinsics.j(descriptiveFeatures, "descriptiveFeatures");
        Intrinsics.j(disclaimer, "disclaimer");
        Intrinsics.j(ean, "ean");
        Intrinsics.j(images, "images");
        Intrinsics.j(itemUnitOfMeasure, "itemUnitOfMeasure");
        Intrinsics.j(name, "name");
        Intrinsics.j(price, "price");
        Intrinsics.j(stockInfo, "stockInfo");
        return new HybrisProduct(ageRestricted, alcohol, alcoholRestricted, availableForPickup, isBopas, buyable, categories, chokingHazard, classifications, clickAndCollect, code, countryOfOrigin, description, descriptiveFeatures, disabled, disclaimer, discount, discountedPrice, displayable, ean, hasMPerksOffers, homeDeliveryNotAvailable, images, ingredients, itemUnitOfMeasure, manufacturer, isMap, meijerBrand, name, numberOfReviews, orderQuantityInterval, prepareItem, price, priceByWeight, primaryUpcFlag, depositPrice, packageSize, purchasable, qtyIncrement, sale, stockInfo, summary, priceUnit, unit, unitCode, upcType, isEbtProduct, url, validDates, nutritionLabel, maxOrderQuantity, mPerksOfferIds, isSponsoredCriteo, storeId, isSubscriptionAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisProduct)) {
            return false;
        }
        HybrisProduct hybrisProduct = (HybrisProduct) other;
        return this.ageRestricted == hybrisProduct.ageRestricted && this.alcohol == hybrisProduct.alcohol && this.alcoholRestricted == hybrisProduct.alcoholRestricted && this.availableForPickup == hybrisProduct.availableForPickup && this.isBopas == hybrisProduct.isBopas && this.buyable == hybrisProduct.buyable && Intrinsics.e(this.categories, hybrisProduct.categories) && this.chokingHazard == hybrisProduct.chokingHazard && Intrinsics.e(this.classifications, hybrisProduct.classifications) && this.clickAndCollect == hybrisProduct.clickAndCollect && Intrinsics.e(this.code, hybrisProduct.code) && Intrinsics.e(this.countryOfOrigin, hybrisProduct.countryOfOrigin) && Intrinsics.e(this.description, hybrisProduct.description) && Intrinsics.e(this.descriptiveFeatures, hybrisProduct.descriptiveFeatures) && this.disabled == hybrisProduct.disabled && Intrinsics.e(this.disclaimer, hybrisProduct.disclaimer) && Intrinsics.e(this.discount, hybrisProduct.discount) && Intrinsics.e(this.discountedPrice, hybrisProduct.discountedPrice) && this.displayable == hybrisProduct.displayable && Intrinsics.e(this.ean, hybrisProduct.ean) && this.hasMPerksOffers == hybrisProduct.hasMPerksOffers && this.homeDeliveryNotAvailable == hybrisProduct.homeDeliveryNotAvailable && Intrinsics.e(this.images, hybrisProduct.images) && Intrinsics.e(this.ingredients, hybrisProduct.ingredients) && Intrinsics.e(this.itemUnitOfMeasure, hybrisProduct.itemUnitOfMeasure) && Intrinsics.e(this.manufacturer, hybrisProduct.manufacturer) && this.isMap == hybrisProduct.isMap && this.meijerBrand == hybrisProduct.meijerBrand && Intrinsics.e(this.name, hybrisProduct.name) && Intrinsics.e(this.numberOfReviews, hybrisProduct.numberOfReviews) && this.orderQuantityInterval == hybrisProduct.orderQuantityInterval && this.prepareItem == hybrisProduct.prepareItem && Intrinsics.e(this.price, hybrisProduct.price) && this.priceByWeight == hybrisProduct.priceByWeight && this.primaryUpcFlag == hybrisProduct.primaryUpcFlag && Intrinsics.e(this.depositPrice, hybrisProduct.depositPrice) && Intrinsics.e(this.packageSize, hybrisProduct.packageSize) && this.purchasable == hybrisProduct.purchasable && Double.compare(this.qtyIncrement, hybrisProduct.qtyIncrement) == 0 && this.sale == hybrisProduct.sale && Intrinsics.e(this.stockInfo, hybrisProduct.stockInfo) && Intrinsics.e(this.summary, hybrisProduct.summary) && Intrinsics.e(this.priceUnit, hybrisProduct.priceUnit) && Intrinsics.e(this.unit, hybrisProduct.unit) && Intrinsics.e(this.unitCode, hybrisProduct.unitCode) && Intrinsics.e(this.upcType, hybrisProduct.upcType) && this.isEbtProduct == hybrisProduct.isEbtProduct && Intrinsics.e(this.url, hybrisProduct.url) && this.validDates == hybrisProduct.validDates && Intrinsics.e(this.nutritionLabel, hybrisProduct.nutritionLabel) && Intrinsics.e(this.maxOrderQuantity, hybrisProduct.maxOrderQuantity) && Intrinsics.e(this.mPerksOfferIds, hybrisProduct.mPerksOfferIds) && this.isSponsoredCriteo == hybrisProduct.isSponsoredCriteo && this.storeId == hybrisProduct.storeId && this.isSubscriptionAvailable == hybrisProduct.isSubscriptionAvailable;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.ageRestricted) * 31) + Boolean.hashCode(this.alcohol)) * 31) + Boolean.hashCode(this.alcoholRestricted)) * 31) + Boolean.hashCode(this.availableForPickup)) * 31) + Boolean.hashCode(this.isBopas)) * 31) + Boolean.hashCode(this.buyable)) * 31;
        List<HybrisCategory> list = this.categories;
        int iHashCode2 = (((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.chokingHazard)) * 31) + this.classifications.hashCode()) * 31) + Boolean.hashCode(this.clickAndCollect)) * 31) + this.code.hashCode()) * 31;
        String str = this.countryOfOrigin;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.descriptiveFeatures.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + this.disclaimer.hashCode()) * 31;
        HybrisDiscount hybrisDiscount = this.discount;
        int iHashCode5 = (iHashCode4 + (hybrisDiscount == null ? 0 : hybrisDiscount.hashCode())) * 31;
        HybrisPrice hybrisPrice = this.discountedPrice;
        int iHashCode6 = (((((((((((iHashCode5 + (hybrisPrice == null ? 0 : hybrisPrice.hashCode())) * 31) + Boolean.hashCode(this.displayable)) * 31) + this.ean.hashCode()) * 31) + Boolean.hashCode(this.hasMPerksOffers)) * 31) + Boolean.hashCode(this.homeDeliveryNotAvailable)) * 31) + this.images.hashCode()) * 31;
        String str3 = this.ingredients;
        int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.itemUnitOfMeasure.hashCode()) * 31;
        String str4 = this.manufacturer;
        int iHashCode8 = (((((((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isMap)) * 31) + Boolean.hashCode(this.meijerBrand)) * 31) + this.name.hashCode()) * 31;
        Integer num = this.numberOfReviews;
        int iHashCode9 = (((((((((((iHashCode8 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.orderQuantityInterval)) * 31) + Boolean.hashCode(this.prepareItem)) * 31) + this.price.hashCode()) * 31) + Boolean.hashCode(this.priceByWeight)) * 31) + Boolean.hashCode(this.primaryUpcFlag)) * 31;
        HybrisPrice hybrisPrice2 = this.depositPrice;
        int iHashCode10 = (iHashCode9 + (hybrisPrice2 == null ? 0 : hybrisPrice2.hashCode())) * 31;
        String str5 = this.packageSize;
        int iHashCode11 = (((((((((iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.purchasable)) * 31) + Double.hashCode(this.qtyIncrement)) * 31) + Boolean.hashCode(this.sale)) * 31) + this.stockInfo.hashCode()) * 31;
        String str6 = this.summary;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.priceUnit;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.unit;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.unitCode;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.upcType;
        int iHashCode16 = (((iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.isEbtProduct)) * 31;
        String str11 = this.url;
        int iHashCode17 = (((iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31) + Boolean.hashCode(this.validDates)) * 31;
        HybrisNutritionLabel hybrisNutritionLabel = this.nutritionLabel;
        int iHashCode18 = (iHashCode17 + (hybrisNutritionLabel == null ? 0 : hybrisNutritionLabel.hashCode())) * 31;
        Integer num2 = this.maxOrderQuantity;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Long> list2 = this.mPerksOfferIds;
        return ((((((iHashCode19 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSponsoredCriteo)) * 31) + Integer.hashCode(this.storeId)) * 31) + Boolean.hashCode(this.isSubscriptionAvailable);
    }

    public String toString() {
        return "HybrisProduct(ageRestricted=" + this.ageRestricted + ", alcohol=" + this.alcohol + ", alcoholRestricted=" + this.alcoholRestricted + ", availableForPickup=" + this.availableForPickup + ", isBopas=" + this.isBopas + ", buyable=" + this.buyable + ", categories=" + this.categories + ", chokingHazard=" + this.chokingHazard + ", classifications=" + this.classifications + ", clickAndCollect=" + this.clickAndCollect + ", code=" + this.code + ", countryOfOrigin=" + this.countryOfOrigin + ", description=" + this.description + ", descriptiveFeatures=" + this.descriptiveFeatures + ", disabled=" + this.disabled + ", disclaimer=" + this.disclaimer + ", discount=" + this.discount + ", discountedPrice=" + this.discountedPrice + ", displayable=" + this.displayable + ", ean=" + this.ean + ", hasMPerksOffers=" + this.hasMPerksOffers + ", homeDeliveryNotAvailable=" + this.homeDeliveryNotAvailable + ", images=" + this.images + ", ingredients=" + this.ingredients + ", itemUnitOfMeasure=" + this.itemUnitOfMeasure + ", manufacturer=" + this.manufacturer + ", isMap=" + this.isMap + ", meijerBrand=" + this.meijerBrand + ", name=" + this.name + ", numberOfReviews=" + this.numberOfReviews + ", orderQuantityInterval=" + this.orderQuantityInterval + ", prepareItem=" + this.prepareItem + ", price=" + this.price + ", priceByWeight=" + this.priceByWeight + ", primaryUpcFlag=" + this.primaryUpcFlag + ", depositPrice=" + this.depositPrice + ", packageSize=" + this.packageSize + ", purchasable=" + this.purchasable + ", qtyIncrement=" + this.qtyIncrement + ", sale=" + this.sale + ", stockInfo=" + this.stockInfo + ", summary=" + this.summary + ", priceUnit=" + this.priceUnit + ", unit=" + this.unit + ", unitCode=" + this.unitCode + ", upcType=" + this.upcType + ", isEbtProduct=" + this.isEbtProduct + ", url=" + this.url + ", validDates=" + this.validDates + ", nutritionLabel=" + this.nutritionLabel + ", maxOrderQuantity=" + this.maxOrderQuantity + ", mPerksOfferIds=" + this.mPerksOfferIds + ", isSponsoredCriteo=" + this.isSponsoredCriteo + ", storeId=" + this.storeId + ", isSubscriptionAvailable=" + this.isSubscriptionAvailable + ')';
    }

    public HybrisProduct(@g(name = "ageRestricted") boolean z10, @g(name = "alcohol") boolean z11, @g(name = "alcoholRestricted") boolean z12, @g(name = "availableForPickup") boolean z13, @g(name = "bopas") boolean z14, @g(name = "buyable") boolean z15, @g(name = "categories") List<HybrisCategory> list, @g(name = "chokingHazard") boolean z16, @g(name = "classifications") List<HybrisClassification> classifications, @g(name = "clickAndCollect") boolean z17, @g(name = "code") String code, @g(name = "countryOfOrigin") String str, @g(name = "description") String str2, @g(name = "descriptiveFeatures") String descriptiveFeatures, @g(name = "disabled") boolean z18, @g(name = "disclaimer") String disclaimer, @g(name = "discount") HybrisDiscount hybrisDiscount, @g(name = "discountedPrice") HybrisPrice hybrisPrice, @g(name = "displayable") boolean z19, @g(name = "ean") String ean, @g(name = "hasMPerks") boolean z20, @g(name = "homeDeliveryNotAvailable") boolean z21, @g(name = "images") List<HybrisImage> images, @g(name = "ingredients") String str3, @g(name = "itemUnitOfMeasure") String itemUnitOfMeasure, @g(name = "manufacturer") String str4, @g(name = "map") boolean z22, @g(name = "meijerBrand") boolean z23, @g(name = "name") String name, @g(name = "numberOfReviews") Integer num, @g(name = "orderQuantityInterval") int i10, @g(name = "prepareItem") boolean z24, @g(name = "price") HybrisPrice price, @g(name = "priceByWeight") boolean z25, @g(name = "primaryUpcFlag") boolean z26, @g(name = "depositPrice") HybrisPrice hybrisPrice2, @g(name = "packageSize") String str5, @g(name = "purchasable") boolean z27, @g(name = "qtyIncrement") double d10, @g(name = "sale") boolean z28, @g(name = "stock") HybrisStockInfo stockInfo, @g(name = "summary") String str6, @g(name = "priceUnit") String str7, @g(name = "unit") String str8, @g(name = "unitCode") String str9, @g(name = "upcType") String str10, @g(name = "ebtFoodstampable") boolean z29, @g(name = "url") String str11, @g(name = "validDates") boolean z30, @g(name = "nutritionLabel") HybrisNutritionLabel hybrisNutritionLabel, @g(name = "maxOrderQuantity") Integer num2, @g(name = "mperksOfferIds") List<Long> list2, @g(name = "isCriteoSponsored") boolean z31, @g(name = "storeId") int i11, @g(name = "subscriptionAvailable") boolean z32) {
        Intrinsics.j(classifications, "classifications");
        Intrinsics.j(code, "code");
        Intrinsics.j(descriptiveFeatures, "descriptiveFeatures");
        Intrinsics.j(disclaimer, "disclaimer");
        Intrinsics.j(ean, "ean");
        Intrinsics.j(images, "images");
        Intrinsics.j(itemUnitOfMeasure, "itemUnitOfMeasure");
        Intrinsics.j(name, "name");
        Intrinsics.j(price, "price");
        Intrinsics.j(stockInfo, "stockInfo");
        this.ageRestricted = z10;
        this.alcohol = z11;
        this.alcoholRestricted = z12;
        this.availableForPickup = z13;
        this.isBopas = z14;
        this.buyable = z15;
        this.categories = list;
        this.chokingHazard = z16;
        this.classifications = classifications;
        this.clickAndCollect = z17;
        this.code = code;
        this.countryOfOrigin = str;
        this.description = str2;
        this.descriptiveFeatures = descriptiveFeatures;
        this.disabled = z18;
        this.disclaimer = disclaimer;
        this.discount = hybrisDiscount;
        this.discountedPrice = hybrisPrice;
        this.displayable = z19;
        this.ean = ean;
        this.hasMPerksOffers = z20;
        this.homeDeliveryNotAvailable = z21;
        this.images = images;
        this.ingredients = str3;
        this.itemUnitOfMeasure = itemUnitOfMeasure;
        this.manufacturer = str4;
        this.isMap = z22;
        this.meijerBrand = z23;
        this.name = name;
        this.numberOfReviews = num;
        this.orderQuantityInterval = i10;
        this.prepareItem = z24;
        this.price = price;
        this.priceByWeight = z25;
        this.primaryUpcFlag = z26;
        this.depositPrice = hybrisPrice2;
        this.packageSize = str5;
        this.purchasable = z27;
        this.qtyIncrement = d10;
        this.sale = z28;
        this.stockInfo = stockInfo;
        this.summary = str6;
        this.priceUnit = str7;
        this.unit = str8;
        this.unitCode = str9;
        this.upcType = str10;
        this.isEbtProduct = z29;
        this.url = str11;
        this.validDates = z30;
        this.nutritionLabel = hybrisNutritionLabel;
        this.maxOrderQuantity = num2;
        this.mPerksOfferIds = list2;
        this.isSponsoredCriteo = z31;
        this.storeId = i11;
        this.isSubscriptionAvailable = z32;
    }

    public final List<Long> A() {
        return this.mPerksOfferIds;
    }

    /* renamed from: B, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: C, reason: from getter */
    public final Integer getMaxOrderQuantity() {
        return this.maxOrderQuantity;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getMeijerBrand() {
        return this.meijerBrand;
    }

    /* renamed from: E, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: F, reason: from getter */
    public final Integer getNumberOfReviews() {
        return this.numberOfReviews;
    }

    /* renamed from: G, reason: from getter */
    public final HybrisNutritionLabel getNutritionLabel() {
        return this.nutritionLabel;
    }

    /* renamed from: H, reason: from getter */
    public final int getOrderQuantityInterval() {
        return this.orderQuantityInterval;
    }

    /* renamed from: I, reason: from getter */
    public final String getPackageSize() {
        return this.packageSize;
    }

    /* renamed from: J, reason: from getter */
    public final boolean getPrepareItem() {
        return this.prepareItem;
    }

    /* renamed from: K, reason: from getter */
    public final HybrisPrice getPrice() {
        return this.price;
    }

    /* renamed from: L, reason: from getter */
    public final boolean getPriceByWeight() {
        return this.priceByWeight;
    }

    /* renamed from: M, reason: from getter */
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* renamed from: N, reason: from getter */
    public final boolean getPrimaryUpcFlag() {
        return this.primaryUpcFlag;
    }

    /* renamed from: O, reason: from getter */
    public final boolean getPurchasable() {
        return this.purchasable;
    }

    /* renamed from: P, reason: from getter */
    public final double getQtyIncrement() {
        return this.qtyIncrement;
    }

    /* renamed from: Q, reason: from getter */
    public final boolean getSale() {
        return this.sale;
    }

    /* renamed from: R, reason: from getter */
    public final HybrisStockInfo getStockInfo() {
        return this.stockInfo;
    }

    /* renamed from: S, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: T, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: U, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* renamed from: V, reason: from getter */
    public final String getUnitCode() {
        return this.unitCode;
    }

    /* renamed from: W, reason: from getter */
    public final String getUpcType() {
        return this.upcType;
    }

    /* renamed from: X, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: Y, reason: from getter */
    public final boolean getValidDates() {
        return this.validDates;
    }

    /* renamed from: Z, reason: from getter */
    public final boolean getIsBopas() {
        return this.isBopas;
    }

    /* renamed from: a0, reason: from getter */
    public final boolean getIsEbtProduct() {
        return this.isEbtProduct;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAgeRestricted() {
        return this.ageRestricted;
    }

    /* renamed from: b0, reason: from getter */
    public final boolean getIsMap() {
        return this.isMap;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAlcohol() {
        return this.alcohol;
    }

    /* renamed from: c0, reason: from getter */
    public final boolean getIsSponsoredCriteo() {
        return this.isSponsoredCriteo;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getAlcoholRestricted() {
        return this.alcoholRestricted;
    }

    /* renamed from: d0, reason: from getter */
    public final boolean getIsSubscriptionAvailable() {
        return this.isSubscriptionAvailable;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getAvailableForPickup() {
        return this.availableForPickup;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getBuyable() {
        return this.buyable;
    }

    public final List<HybrisCategory> g() {
        return this.categories;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getChokingHazard() {
        return this.chokingHazard;
    }

    public final List<HybrisClassification> i() {
        return this.classifications;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getClickAndCollect() {
        return this.clickAndCollect;
    }

    /* renamed from: k, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: l, reason: from getter */
    public final String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    /* renamed from: m, reason: from getter */
    public final HybrisPrice getDepositPrice() {
        return this.depositPrice;
    }

    /* renamed from: n, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: o, reason: from getter */
    public final String getDescriptiveFeatures() {
        return this.descriptiveFeatures;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: q, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: r, reason: from getter */
    public final HybrisDiscount getDiscount() {
        return this.discount;
    }

    /* renamed from: s, reason: from getter */
    public final HybrisPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getDisplayable() {
        return this.displayable;
    }

    /* renamed from: u, reason: from getter */
    public final String getEan() {
        return this.ean;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getHasMPerksOffers() {
        return this.hasMPerksOffers;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getHomeDeliveryNotAvailable() {
        return this.homeDeliveryNotAvailable;
    }

    public final List<HybrisImage> x() {
        return this.images;
    }

    /* renamed from: y, reason: from getter */
    public final String getIngredients() {
        return this.ingredients;
    }

    /* renamed from: z, reason: from getter */
    public final String getItemUnitOfMeasure() {
        return this.itemUnitOfMeasure;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HybrisProduct(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, boolean z16, List list2, boolean z17, String str, String str2, String str3, String str4, boolean z18, String str5, HybrisDiscount hybrisDiscount, HybrisPrice hybrisPrice, boolean z19, String str6, boolean z20, boolean z21, List list3, String str7, String str8, String str9, boolean z22, boolean z23, String str10, Integer num, int i10, boolean z24, HybrisPrice hybrisPrice2, boolean z25, boolean z26, HybrisPrice hybrisPrice3, String str11, boolean z27, double d10, boolean z28, HybrisStockInfo hybrisStockInfo, String str12, String str13, String str14, String str15, String str16, boolean z29, String str17, boolean z30, HybrisNutritionLabel hybrisNutritionLabel, Integer num2, List list4, boolean z31, int i11, boolean z32, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z33 = (i12 & 1) != 0 ? false : z10;
        boolean z34 = (i12 & 2) != 0 ? false : z11;
        this(z33, z34, (i12 & 4) != 0 ? z34 : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? true : z15, (i12 & 64) != 0 ? CollectionsKt.m() : list, (i12 & 128) != 0 ? false : z16, (i12 & 256) != 0 ? CollectionsKt.m() : list2, (i12 & 512) != 0 ? false : z17, (i12 & 1024) != 0 ? "" : str, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str2, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str3, (i12 & 8192) != 0 ? "" : str4, (i12 & 16384) != 0 ? false : z18, (i12 & 32768) != 0 ? "" : str5, (i12 & 65536) != 0 ? null : hybrisDiscount, (i12 & 131072) != 0 ? null : hybrisPrice, (i12 & 262144) != 0 ? true : z19, (i12 & 524288) != 0 ? "" : str6, (i12 & 1048576) != 0 ? false : z20, (i12 & 2097152) != 0 ? false : z21, (i12 & 4194304) != 0 ? CollectionsKt.m() : list3, (i12 & 8388608) != 0 ? "" : str7, (i12 & 16777216) != 0 ? "Each" : str8, (i12 & 33554432) != 0 ? null : str9, (i12 & 67108864) != 0 ? false : z22, (i12 & 134217728) != 0 ? false : z23, (i12 & 268435456) != 0 ? "" : str10, (i12 & 536870912) != 0 ? 0 : num, (i12 & 1073741824) != 0 ? 0 : i10, (i12 & Integer.MIN_VALUE) != 0 ? false : z24, (i13 & 1) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice2, (i13 & 2) != 0 ? false : z25, (i13 & 4) != 0 ? false : z26, (i13 & 8) != 0 ? null : hybrisPrice3, (i13 & 16) != 0 ? null : str11, (i13 & 32) != 0 ? false : z27, (i13 & 64) != 0 ? 0.0d : d10, (i13 & 128) != 0 ? false : z28, (i13 & 256) != 0 ? new HybrisStockInfo(null, 0, null, null, null, false, 63, null) : hybrisStockInfo, (i13 & 512) != 0 ? "" : str12, (i13 & 1024) != 0 ? null : str13, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str14, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str15, (i13 & 8192) != 0 ? "" : str16, (i13 & 16384) != 0 ? false : z29, (i13 & 32768) == 0 ? str17 : "", (i13 & 65536) != 0 ? false : z30, (i13 & 131072) != 0 ? null : hybrisNutritionLabel, (i13 & 262144) != 0 ? null : num2, (i13 & 524288) == 0 ? list4 : null, (i13 & 1048576) != 0 ? false : z31, (i13 & 2097152) != 0 ? 0 : i11, (i13 & 4194304) != 0 ? false : z32);
    }
}
