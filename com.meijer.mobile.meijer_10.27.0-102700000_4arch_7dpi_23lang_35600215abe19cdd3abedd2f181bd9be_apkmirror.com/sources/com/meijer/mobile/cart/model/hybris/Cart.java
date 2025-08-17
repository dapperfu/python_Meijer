package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.principal.HybrisPrincipal;
import com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import ej.InterfaceC13678f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b`\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0005\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\b\u0003\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0019\u0012\u000e\b\u0003\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0003\u0010\u001f\u001a\u00020\n\u0012\b\b\u0003\u0010 \u001a\u00020\n\u0012\b\b\u0003\u0010!\u001a\u00020\n\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0003\u0010#\u001a\u00020\n\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010%\u001a\u00020\n\u0012\b\b\u0003\u0010'\u001a\u00020&\u0012\b\b\u0003\u0010(\u001a\u00020\u0014\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0003\u00101\u001a\u00020\u0019\u0012\u000e\b\u0003\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0007\u0012\b\b\u0003\u00104\u001a\u00020\n\u0012\b\b\u0003\u00105\u001a\u00020\u0014\u0012\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0003\u0010:\u001a\u00020\u0002\u0012\b\b\u0003\u0010;\u001a\u00020&\u0012\b\b\u0003\u0010<\u001a\u00020\u0002\u0012\b\b\u0003\u0010=\u001a\u00020\u0014\u0012\b\b\u0003\u0010>\u001a\u00020\n\u0012\b\b\u0003\u0010?\u001a\u00020&\u0012\b\b\u0003\u0010@\u001a\u00020&\u0012\b\b\u0003\u0010A\u001a\u00020\u0014\u0012\b\b\u0003\u0010B\u001a\u00020\u0019\u0012\b\b\u0003\u0010C\u001a\u00020\u0014\u0012\b\b\u0003\u0010D\u001a\u00020\u0014\u0012\b\b\u0003\u0010E\u001a\u00020\u0014\u0012\b\b\u0003\u0010F\u001a\u00020\u0014\u0012\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0003\u0010H\u001a\u00020&\u0012\b\b\u0003\u0010I\u001a\u00020\u0014\u0012\b\b\u0003\u0010J\u001a\u00020\u0019\u0012\n\b\u0003\u0010K\u001a\u0004\u0018\u000108\u0012\f\b\u0003\u0010M\u001a\u00060\u0002j\u0002`L\u0012\u0010\b\u0003\u0010N\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\b\u0003\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u0007\u0012\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u0007\u0012\b\b\u0003\u0010U\u001a\u00020\u0014\u0012\b\b\u0003\u0010V\u001a\u00020\u0014\u0012\b\b\u0003\u0010W\u001a\u00020\u0014\u0012\b\b\u0003\u0010X\u001a\u00020\u0014¢\u0006\u0004\bY\u0010ZJÒ\u0005\u0010[\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\f\b\u0003\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u00142\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u001a\u001a\u00020\u00192\u000e\b\u0003\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0003\u0010\u001f\u001a\u00020\n2\b\b\u0003\u0010 \u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\n2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010#\u001a\u00020\n2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010%\u001a\u00020\n2\b\b\u0003\u0010'\u001a\u00020&2\b\b\u0003\u0010(\u001a\u00020\u00142\n\b\u0003\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0003\u00100\u001a\u0004\u0018\u00010/2\b\b\u0003\u00101\u001a\u00020\u00192\u000e\b\u0003\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00072\b\b\u0003\u00104\u001a\u00020\n2\b\b\u0003\u00105\u001a\u00020\u00142\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00109\u001a\u0004\u0018\u0001082\b\b\u0003\u0010:\u001a\u00020\u00022\b\b\u0003\u0010;\u001a\u00020&2\b\b\u0003\u0010<\u001a\u00020\u00022\b\b\u0003\u0010=\u001a\u00020\u00142\b\b\u0003\u0010>\u001a\u00020\n2\b\b\u0003\u0010?\u001a\u00020&2\b\b\u0003\u0010@\u001a\u00020&2\b\b\u0003\u0010A\u001a\u00020\u00142\b\b\u0003\u0010B\u001a\u00020\u00192\b\b\u0003\u0010C\u001a\u00020\u00142\b\b\u0003\u0010D\u001a\u00020\u00142\b\b\u0003\u0010E\u001a\u00020\u00142\b\b\u0003\u0010F\u001a\u00020\u00142\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010H\u001a\u00020&2\b\b\u0003\u0010I\u001a\u00020\u00142\b\b\u0003\u0010J\u001a\u00020\u00192\n\b\u0003\u0010K\u001a\u0004\u0018\u0001082\f\b\u0003\u0010M\u001a\u00060\u0002j\u0002`L2\u0010\b\u0003\u0010N\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u000e\b\u0003\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00072\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00072\b\b\u0003\u0010U\u001a\u00020\u00142\b\b\u0003\u0010V\u001a\u00020\u00142\b\b\u0003\u0010W\u001a\u00020\u00142\b\b\u0003\u0010X\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b_\u0010`J\u001a\u0010c\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010aHÖ\u0003¢\u0006\u0004\bc\u0010dR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010^R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bh\u0010rR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bs\u0010uR\u001b\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e8\u0006¢\u0006\f\n\u0004\bv\u0010f\u001a\u0004\bw\u0010^R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001b\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0081\u0001\u001a\u0005\b|\u0010\u0083\u0001R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0084\u0001\u0010\u0087\u0001R\u001a\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0088\u0001\u001a\u0005\b\u0080\u0001\u0010`R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010m\u001a\u0005\b\u0085\u0001\u0010oR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\bv\u0010\u008c\u0001R\u0019\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010q\u001a\u0005\b\u0089\u0001\u0010rR\u0018\u0010 \u001a\u00020\n8\u0006¢\u0006\r\n\u0005\b\u008e\u0001\u0010q\u001a\u0004\bx\u0010rR\u0019\u0010!\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010q\u001a\u0005\b\u008a\u0001\u0010rR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0081\u0001\u001a\u0006\b\u0091\u0001\u0010\u0083\u0001R\u0019\u0010#\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010q\u001a\u0005\b\u0092\u0001\u0010rR\u001b\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010f\u001a\u0005\b\u0094\u0001\u0010^R\u0018\u0010%\u001a\u00020\n8\u0006¢\u0006\r\n\u0004\bn\u0010q\u001a\u0005\b\u0095\u0001\u0010rR\u001a\u0010'\u001a\u00020&8\u0006¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0096\u0001\u001a\u0005\bl\u0010\u0097\u0001R\u001b\u0010(\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0081\u0001\u001a\u0006\b\u0098\u0001\u0010\u0083\u0001R\u001d\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000f\n\u0005\bw\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001d\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001d\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001a\u00101\u001a\u00020\u00198\u0006¢\u0006\u000f\n\u0006\b¨\u0001\u0010\u0088\u0001\u001a\u0005\b©\u0001\u0010`R\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00078\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010m\u001a\u0005\bª\u0001\u0010oR\u0019\u00104\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010q\u001a\u0005\b«\u0001\u0010rR\u001b\u00105\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0081\u0001\u001a\u0006\b¬\u0001\u0010\u0083\u0001R\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010f\u001a\u0005\b®\u0001\u0010^R\u001a\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bj\u0010f\u001a\u0005\b¯\u0001\u0010^R\u001d\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u0019\u0010:\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010f\u001a\u0005\b³\u0001\u0010^R\u001b\u0010;\u001a\u00020&8\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0096\u0001\u001a\u0006\b´\u0001\u0010\u0097\u0001R\u0019\u0010<\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010f\u001a\u0005\bµ\u0001\u0010^R\u001b\u0010=\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0081\u0001\u001a\u0006\b¶\u0001\u0010\u0083\u0001R\u0019\u0010>\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010q\u001a\u0005\b·\u0001\u0010rR\u001a\u0010?\u001a\u00020&8\u0006¢\u0006\u000f\n\u0006\bª\u0001\u0010\u0096\u0001\u001a\u0005\bq\u0010\u0097\u0001R\u001a\u0010@\u001a\u00020&8\u0006¢\u0006\u000f\n\u0005\bz\u0010\u0096\u0001\u001a\u0006\b¨\u0001\u0010\u0097\u0001R\u001b\u0010A\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u0081\u0001\u001a\u0006\b¸\u0001\u0010\u0083\u0001R\u001a\u0010B\u001a\u00020\u00198\u0006¢\u0006\u000f\n\u0006\b®\u0001\u0010\u0088\u0001\u001a\u0005\b¹\u0001\u0010`R\u001b\u0010C\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0081\u0001\u001a\u0006\b¤\u0001\u0010\u0083\u0001R\u001b\u0010D\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0081\u0001\u001a\u0006\bº\u0001\u0010\u0083\u0001R\u001b\u0010E\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0081\u0001\u001a\u0006\b»\u0001\u0010\u0083\u0001R\u001b\u0010F\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010\u0081\u0001\u001a\u0006\b¼\u0001\u0010\u0083\u0001R\u001c\u0010G\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0006\bµ\u0001\u0010\u0081\u0001\u001a\u0005\bp\u0010\u0083\u0001R\u001b\u0010H\u001a\u00020&8\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u0096\u0001\u001a\u0006\b½\u0001\u0010\u0097\u0001R\u001a\u0010I\u001a\u00020\u00148\u0006¢\u0006\u000f\n\u0005\b~\u0010\u0081\u0001\u001a\u0006\b¾\u0001\u0010\u0083\u0001R\u0019\u0010J\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bq\u0010\u0088\u0001\u001a\u0005\b¿\u0001\u0010`R\u001d\u0010K\u001a\u0004\u0018\u0001088\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010°\u0001\u001a\u0006\bÀ\u0001\u0010²\u0001R\u001d\u0010M\u001a\u00060\u0002j\u0002`L8\u0006¢\u0006\u000e\n\u0005\bº\u0001\u0010f\u001a\u0005\bÁ\u0001\u0010^R!\u0010N\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010f\u001a\u0005\b\u00ad\u0001\u0010^R\u001f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00078\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010m\u001a\u0005\b \u0001\u0010oR\u001b\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010f\u001a\u0005\b\u0099\u0001\u0010^R\u001b\u0010R\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010f\u001a\u0005\b\u0088\u0001\u0010^R\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00078\u0006¢\u0006\r\n\u0005\b½\u0001\u0010m\u001a\u0004\be\u0010oR\u001b\u0010U\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u0081\u0001\u001a\u0006\b\u008d\u0001\u0010\u0083\u0001R\u001b\u0010V\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u0081\u0001\u001a\u0006\b\u008e\u0001\u0010\u0083\u0001R\u001b\u0010W\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u0081\u0001\u001a\u0006\b\u0090\u0001\u0010\u0083\u0001R\u001b\u0010X\u001a\u00020\u00148\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u0081\u0001\u001a\u0006\b\u008f\u0001\u0010\u0083\u0001R\u001b\u0010Ã\u0001\u001a\u00070\u0019j\u0003`Â\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010`¨\u0006Ä\u0001"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/Cart;", "Lej/f;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "outOfStockModifications", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "entries", "", "calculated", "Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "customerData", "Lcom/meijer/mobile/core/model/common/Guid;", "guid", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "pointOfService", "Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "substitutePreference", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "depositPrice", "deliveryCost", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "deliveryMode", "", "deliveryItemsQuantity", "Lcom/meijer/mobile/cart/model/hybris/DeliveryOrderGroup;", "deliveryOrderGroups", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "deliveryAddress", "earlyDelivery", "deliveryAddressIsAlcoholEligible", "earlyDeliveryAvailable", "extendedDeliveryCost", "editOrderWet", "expirationTime", "net", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "couponsSavings", "orderDiscounts", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "paymentInfo", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "multiTenderPaymentInfo", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "pickUpPerson", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "pickUpSlotInfo", "pickupItemsQuantity", "Lcom/meijer/mobile/cart/model/hybris/PickupOrderGroup;", "pickupOrderGroups", "phoneNumberTextable", "productDiscounts", "purchaseOrderNumber", "saveTime", "Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "savedBy", "site", "specialSavings", PlaceTypes.STORE, "subTotal", "tippedAndRated", "teamMemberSavings", "mperksSavings", "totalDiscounts", "totalItems", "itemsTotal", "totalCosts", "totalPrice", "totalPriceWithTax", "creditTransactionAmount", "totalSavings", "totalTax", "totalUnitCount", "user", "Lcom/meijer/mobile/cart/model/hybris/HybrisType;", "type", "originalOrderId", "Lcom/meijer/mobile/cart/model/hybris/HighValuePromo;", "highValuePromos", "fulfillmentEligibility", "partnerEligibility", "Lcom/meijer/mobile/cart/model/hybris/FulfillmentEligibility;", "availableFulfillmentEligibilities", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtSurchargePrice", "ebtSuggestedTotal", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/CartModifications;Ljava/util/List;ZLcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;Ljava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;ILjava/util/List;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;ZZZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZLjava/lang/String;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;ILjava/util/List;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ILcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ILcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/CartModifications;Ljava/util/List;ZLcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;Ljava/lang/String;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;ILjava/util/List;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;ZZZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZLjava/lang/String;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;ILjava/util/List;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ILcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ILcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)Lcom/meijer/mobile/cart/model/hybris/Cart;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getCode", "c", "Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "H", "()Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "d", "Ljava/util/List;", "v", "()Ljava/util/List;", "e", "Z", "()Z", "f", "Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "()Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "g", "z", "h", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "P", "()Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "i", "Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "Y", "()Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "j", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "m", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "k", "l", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "I", "n", "o", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "p", "q", "r", "s", "x", "t", "u", "w", "E", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "F", "y", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "J", "()Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "D", "()Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "A", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "L", "()Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "B", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "M", "()Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "C", "N", "O", "K", "Q", "G", "R", "S", "Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "T", "()Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "U", "V", "W", "X", "a0", "c0", "d0", "b0", "e0", "f0", "g0", "h0", "i0", "k0", "j0", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Cart implements InterfaceC13678f {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPickupPerson pickUpPerson;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPickupSlotInfo pickUpSlotInfo;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pickupItemsQuantity;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PickupOrderGroup> pickupOrderGroups;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneNumberTextable;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice productDiscounts;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String purchaseOrderNumber;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final String saveTime;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrincipal savedBy;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final String site;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings specialSavings;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final String store;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice subTotal;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippedAndRated;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings teamMemberSavings;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings mperksSavings;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalDiscounts;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalItems;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice itemsTotal;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalCosts;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPrice;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPriceWithTax;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice creditTransactionAmount;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings totalSavings;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalTax;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalUnitCount;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrincipal user;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartModifications outOfStockModifications;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalOrderId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryJson> entries;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HighValuePromo> highValuePromos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean calculated;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDataResponse customerData;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentEligibility> availableFulfillmentEligibilities;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPointOfService pointOfService;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtEligibleTotal;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSubstitutePreference substitutePreference;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtNonEligibleTotal;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice depositPrice;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtSurchargePrice;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice deliveryCost;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtSuggestedTotal;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisDeliveryMode deliveryMode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryItemsQuantity;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DeliveryOrderGroup> deliveryOrderGroups;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCustomerAddress deliveryAddress;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean deliveryAddressIsAlcoholEligible;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDeliveryAvailable;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice extendedDeliveryCost;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean editOrderWet;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationTime;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean net;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings couponsSavings;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice orderDiscounts;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetails paymentInfo;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiTenderPaymentInfoResponse multiTenderPaymentInfo;

    public Cart(@g(name = "code") String code, @g(name = "cartModification") CartModifications cartModifications, @g(name = "entries") List<EntryJson> entries, @g(name = "calculated") boolean z10, @g(name = "customerData") CustomerDataResponse customerDataResponse, @g(name = "guid") String guid, @g(name = "pointOfService") HybrisPointOfService pointOfService, @g(name = "substitutePreference") HybrisSubstitutePreference hybrisSubstitutePreference, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "deliveryMode") HybrisDeliveryMode hybrisDeliveryMode, @g(name = "deliveryItemsQuantity") int i10, @g(name = "deliveryOrderGroups") List<DeliveryOrderGroup> deliveryOrderGroups, @g(name = "deliveryAddress") HybrisCustomerAddress hybrisCustomerAddress, @g(name = "earlyDelivery") boolean z11, @g(name = "deliveryAddressIsAlcoholEligible") boolean z12, @g(name = "earlyDeliveryAvailable") boolean z13, @g(name = "extendedDeliveryCost") HybrisPrice hybrisPrice, @g(name = "editOrderWet") boolean z14, @g(name = "expirationTime") String str, @g(name = "net") boolean z15, @g(name = "couponsSavings") HybrisSavings couponsSavings, @g(name = "orderDiscounts") HybrisPrice orderDiscounts, @g(name = "paymentInfo") PaymentDetails paymentDetails, @g(name = "multiTenderPaymentInfo") MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse, @g(name = "pickUpPerson") HybrisPickupPerson hybrisPickupPerson, @g(name = "pickUpSlotInfo") HybrisPickupSlotInfo hybrisPickupSlotInfo, @g(name = "pickupItemsQuantity") int i11, @g(name = "pickupOrderGroups") List<PickupOrderGroup> pickupOrderGroups, @g(name = "phoneNumberTextable") boolean z16, @g(name = "productDiscounts") HybrisPrice productDiscounts, @g(name = "purchaseOrderNumber") String str2, @g(name = "saveTime") String str3, @g(name = "savedBy") HybrisPrincipal hybrisPrincipal, @g(name = "site") String site, @g(name = "specialsSavings") HybrisSavings specialSavings, @g(name = PlaceTypes.STORE) String store, @g(name = "subTotal") HybrisPrice subTotal, @g(name = "tippedAndRated") boolean z17, @g(name = "teamMemberSavings") HybrisSavings teamMemberSavings, @g(name = "mperksSavings") HybrisSavings mperksSavings, @g(name = "totalDiscounts") HybrisPrice totalDiscounts, @g(name = "totalItems") int i12, @g(name = "itemsTotal") HybrisPrice itemsTotal, @g(name = "totalCosts") HybrisPrice totalCosts, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax, @g(name = "creditTransactionAmount") HybrisPrice hybrisPrice2, @g(name = "totalSavings") HybrisSavings totalSavings, @g(name = "totalTax") HybrisPrice totalTax, @g(name = "totalUnitCount") int i13, @g(name = "user") HybrisPrincipal hybrisPrincipal2, @g(name = "type") String type, @g(name = "originalOrderId") String str4, @g(name = "highValuePromos") List<HighValuePromo> highValuePromos, @g(name = "fulfillmentEligibility") String str5, @g(name = "partnerEligibility") String str6, @g(name = "availableFulfillmentEligibilities") List<FulfillmentEligibility> availableFulfillmentEligibilities, @g(name = "ebtEligibleTotal") HybrisPrice ebtEligibleTotal, @g(name = "ebtNonEligibleTotal") HybrisPrice ebtNonEligibleTotal, @g(name = "ebtSurchargePrice") HybrisPrice ebtSurchargePrice, @g(name = "ebtSuggestedTotal") HybrisPrice ebtSuggestedTotal) {
        Intrinsics.j(code, "code");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(pointOfService, "pointOfService");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(deliveryOrderGroups, "deliveryOrderGroups");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(pickupOrderGroups, "pickupOrderGroups");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(site, "site");
        Intrinsics.j(specialSavings, "specialSavings");
        Intrinsics.j(store, "store");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(type, "type");
        Intrinsics.j(highValuePromos, "highValuePromos");
        Intrinsics.j(availableFulfillmentEligibilities, "availableFulfillmentEligibilities");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(ebtSuggestedTotal, "ebtSuggestedTotal");
        this.code = code;
        this.outOfStockModifications = cartModifications;
        this.entries = entries;
        this.calculated = z10;
        this.customerData = customerDataResponse;
        this.guid = guid;
        this.pointOfService = pointOfService;
        this.substitutePreference = hybrisSubstitutePreference;
        this.depositPrice = depositPrice;
        this.deliveryCost = deliveryCost;
        this.deliveryMode = hybrisDeliveryMode;
        this.deliveryItemsQuantity = i10;
        this.deliveryOrderGroups = deliveryOrderGroups;
        this.deliveryAddress = hybrisCustomerAddress;
        this.earlyDelivery = z11;
        this.deliveryAddressIsAlcoholEligible = z12;
        this.earlyDeliveryAvailable = z13;
        this.extendedDeliveryCost = hybrisPrice;
        this.editOrderWet = z14;
        this.expirationTime = str;
        this.net = z15;
        this.couponsSavings = couponsSavings;
        this.orderDiscounts = orderDiscounts;
        this.paymentInfo = paymentDetails;
        this.multiTenderPaymentInfo = multiTenderPaymentInfoResponse;
        this.pickUpPerson = hybrisPickupPerson;
        this.pickUpSlotInfo = hybrisPickupSlotInfo;
        this.pickupItemsQuantity = i11;
        this.pickupOrderGroups = pickupOrderGroups;
        this.phoneNumberTextable = z16;
        this.productDiscounts = productDiscounts;
        this.purchaseOrderNumber = str2;
        this.saveTime = str3;
        this.savedBy = hybrisPrincipal;
        this.site = site;
        this.specialSavings = specialSavings;
        this.store = store;
        this.subTotal = subTotal;
        this.tippedAndRated = z17;
        this.teamMemberSavings = teamMemberSavings;
        this.mperksSavings = mperksSavings;
        this.totalDiscounts = totalDiscounts;
        this.totalItems = i12;
        this.itemsTotal = itemsTotal;
        this.totalCosts = totalCosts;
        this.totalPrice = totalPrice;
        this.totalPriceWithTax = totalPriceWithTax;
        this.creditTransactionAmount = hybrisPrice2;
        this.totalSavings = totalSavings;
        this.totalTax = totalTax;
        this.totalUnitCount = i13;
        this.user = hybrisPrincipal2;
        this.type = type;
        this.originalOrderId = str4;
        this.highValuePromos = highValuePromos;
        this.fulfillmentEligibility = str5;
        this.partnerEligibility = str6;
        this.availableFulfillmentEligibilities = availableFulfillmentEligibilities;
        this.ebtEligibleTotal = ebtEligibleTotal;
        this.ebtNonEligibleTotal = ebtNonEligibleTotal;
        this.ebtSurchargePrice = ebtSurchargePrice;
        this.ebtSuggestedTotal = ebtSuggestedTotal;
    }

    public final Cart copy(@g(name = "code") String code, @g(name = "cartModification") CartModifications outOfStockModifications, @g(name = "entries") List<EntryJson> entries, @g(name = "calculated") boolean calculated, @g(name = "customerData") CustomerDataResponse customerData, @g(name = "guid") String guid, @g(name = "pointOfService") HybrisPointOfService pointOfService, @g(name = "substitutePreference") HybrisSubstitutePreference substitutePreference, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "deliveryMode") HybrisDeliveryMode deliveryMode, @g(name = "deliveryItemsQuantity") int deliveryItemsQuantity, @g(name = "deliveryOrderGroups") List<DeliveryOrderGroup> deliveryOrderGroups, @g(name = "deliveryAddress") HybrisCustomerAddress deliveryAddress, @g(name = "earlyDelivery") boolean earlyDelivery, @g(name = "deliveryAddressIsAlcoholEligible") boolean deliveryAddressIsAlcoholEligible, @g(name = "earlyDeliveryAvailable") boolean earlyDeliveryAvailable, @g(name = "extendedDeliveryCost") HybrisPrice extendedDeliveryCost, @g(name = "editOrderWet") boolean editOrderWet, @g(name = "expirationTime") String expirationTime, @g(name = "net") boolean net2, @g(name = "couponsSavings") HybrisSavings couponsSavings, @g(name = "orderDiscounts") HybrisPrice orderDiscounts, @g(name = "paymentInfo") PaymentDetails paymentInfo, @g(name = "multiTenderPaymentInfo") MultiTenderPaymentInfoResponse multiTenderPaymentInfo, @g(name = "pickUpPerson") HybrisPickupPerson pickUpPerson, @g(name = "pickUpSlotInfo") HybrisPickupSlotInfo pickUpSlotInfo, @g(name = "pickupItemsQuantity") int pickupItemsQuantity, @g(name = "pickupOrderGroups") List<PickupOrderGroup> pickupOrderGroups, @g(name = "phoneNumberTextable") boolean phoneNumberTextable, @g(name = "productDiscounts") HybrisPrice productDiscounts, @g(name = "purchaseOrderNumber") String purchaseOrderNumber, @g(name = "saveTime") String saveTime, @g(name = "savedBy") HybrisPrincipal savedBy, @g(name = "site") String site, @g(name = "specialsSavings") HybrisSavings specialSavings, @g(name = PlaceTypes.STORE) String store, @g(name = "subTotal") HybrisPrice subTotal, @g(name = "tippedAndRated") boolean tippedAndRated, @g(name = "teamMemberSavings") HybrisSavings teamMemberSavings, @g(name = "mperksSavings") HybrisSavings mperksSavings, @g(name = "totalDiscounts") HybrisPrice totalDiscounts, @g(name = "totalItems") int totalItems, @g(name = "itemsTotal") HybrisPrice itemsTotal, @g(name = "totalCosts") HybrisPrice totalCosts, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax, @g(name = "creditTransactionAmount") HybrisPrice creditTransactionAmount, @g(name = "totalSavings") HybrisSavings totalSavings, @g(name = "totalTax") HybrisPrice totalTax, @g(name = "totalUnitCount") int totalUnitCount, @g(name = "user") HybrisPrincipal user, @g(name = "type") String type, @g(name = "originalOrderId") String originalOrderId, @g(name = "highValuePromos") List<HighValuePromo> highValuePromos, @g(name = "fulfillmentEligibility") String fulfillmentEligibility, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "availableFulfillmentEligibilities") List<FulfillmentEligibility> availableFulfillmentEligibilities, @g(name = "ebtEligibleTotal") HybrisPrice ebtEligibleTotal, @g(name = "ebtNonEligibleTotal") HybrisPrice ebtNonEligibleTotal, @g(name = "ebtSurchargePrice") HybrisPrice ebtSurchargePrice, @g(name = "ebtSuggestedTotal") HybrisPrice ebtSuggestedTotal) {
        Intrinsics.j(code, "code");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(pointOfService, "pointOfService");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(deliveryOrderGroups, "deliveryOrderGroups");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(pickupOrderGroups, "pickupOrderGroups");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(site, "site");
        Intrinsics.j(specialSavings, "specialSavings");
        Intrinsics.j(store, "store");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(type, "type");
        Intrinsics.j(highValuePromos, "highValuePromos");
        Intrinsics.j(availableFulfillmentEligibilities, "availableFulfillmentEligibilities");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(ebtSuggestedTotal, "ebtSuggestedTotal");
        return new Cart(code, outOfStockModifications, entries, calculated, customerData, guid, pointOfService, substitutePreference, depositPrice, deliveryCost, deliveryMode, deliveryItemsQuantity, deliveryOrderGroups, deliveryAddress, earlyDelivery, deliveryAddressIsAlcoholEligible, earlyDeliveryAvailable, extendedDeliveryCost, editOrderWet, expirationTime, net2, couponsSavings, orderDiscounts, paymentInfo, multiTenderPaymentInfo, pickUpPerson, pickUpSlotInfo, pickupItemsQuantity, pickupOrderGroups, phoneNumberTextable, productDiscounts, purchaseOrderNumber, saveTime, savedBy, site, specialSavings, store, subTotal, tippedAndRated, teamMemberSavings, mperksSavings, totalDiscounts, totalItems, itemsTotal, totalCosts, totalPrice, totalPriceWithTax, creditTransactionAmount, totalSavings, totalTax, totalUnitCount, user, type, originalOrderId, highValuePromos, fulfillmentEligibility, partnerEligibility, availableFulfillmentEligibilities, ebtEligibleTotal, ebtNonEligibleTotal, ebtSurchargePrice, ebtSuggestedTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) other;
        return Intrinsics.e(this.code, cart.code) && Intrinsics.e(this.outOfStockModifications, cart.outOfStockModifications) && Intrinsics.e(this.entries, cart.entries) && this.calculated == cart.calculated && Intrinsics.e(this.customerData, cart.customerData) && Intrinsics.e(this.guid, cart.guid) && Intrinsics.e(this.pointOfService, cart.pointOfService) && Intrinsics.e(this.substitutePreference, cart.substitutePreference) && Intrinsics.e(this.depositPrice, cart.depositPrice) && Intrinsics.e(this.deliveryCost, cart.deliveryCost) && Intrinsics.e(this.deliveryMode, cart.deliveryMode) && this.deliveryItemsQuantity == cart.deliveryItemsQuantity && Intrinsics.e(this.deliveryOrderGroups, cart.deliveryOrderGroups) && Intrinsics.e(this.deliveryAddress, cart.deliveryAddress) && this.earlyDelivery == cart.earlyDelivery && this.deliveryAddressIsAlcoholEligible == cart.deliveryAddressIsAlcoholEligible && this.earlyDeliveryAvailable == cart.earlyDeliveryAvailable && Intrinsics.e(this.extendedDeliveryCost, cart.extendedDeliveryCost) && this.editOrderWet == cart.editOrderWet && Intrinsics.e(this.expirationTime, cart.expirationTime) && this.net == cart.net && Intrinsics.e(this.couponsSavings, cart.couponsSavings) && Intrinsics.e(this.orderDiscounts, cart.orderDiscounts) && Intrinsics.e(this.paymentInfo, cart.paymentInfo) && Intrinsics.e(this.multiTenderPaymentInfo, cart.multiTenderPaymentInfo) && Intrinsics.e(this.pickUpPerson, cart.pickUpPerson) && Intrinsics.e(this.pickUpSlotInfo, cart.pickUpSlotInfo) && this.pickupItemsQuantity == cart.pickupItemsQuantity && Intrinsics.e(this.pickupOrderGroups, cart.pickupOrderGroups) && this.phoneNumberTextable == cart.phoneNumberTextable && Intrinsics.e(this.productDiscounts, cart.productDiscounts) && Intrinsics.e(this.purchaseOrderNumber, cart.purchaseOrderNumber) && Intrinsics.e(this.saveTime, cart.saveTime) && Intrinsics.e(this.savedBy, cart.savedBy) && Intrinsics.e(this.site, cart.site) && Intrinsics.e(this.specialSavings, cart.specialSavings) && Intrinsics.e(this.store, cart.store) && Intrinsics.e(this.subTotal, cart.subTotal) && this.tippedAndRated == cart.tippedAndRated && Intrinsics.e(this.teamMemberSavings, cart.teamMemberSavings) && Intrinsics.e(this.mperksSavings, cart.mperksSavings) && Intrinsics.e(this.totalDiscounts, cart.totalDiscounts) && this.totalItems == cart.totalItems && Intrinsics.e(this.itemsTotal, cart.itemsTotal) && Intrinsics.e(this.totalCosts, cart.totalCosts) && Intrinsics.e(this.totalPrice, cart.totalPrice) && Intrinsics.e(this.totalPriceWithTax, cart.totalPriceWithTax) && Intrinsics.e(this.creditTransactionAmount, cart.creditTransactionAmount) && Intrinsics.e(this.totalSavings, cart.totalSavings) && Intrinsics.e(this.totalTax, cart.totalTax) && this.totalUnitCount == cart.totalUnitCount && Intrinsics.e(this.user, cart.user) && Intrinsics.e(this.type, cart.type) && Intrinsics.e(this.originalOrderId, cart.originalOrderId) && Intrinsics.e(this.highValuePromos, cart.highValuePromos) && Intrinsics.e(this.fulfillmentEligibility, cart.fulfillmentEligibility) && Intrinsics.e(this.partnerEligibility, cart.partnerEligibility) && Intrinsics.e(this.availableFulfillmentEligibilities, cart.availableFulfillmentEligibilities) && Intrinsics.e(this.ebtEligibleTotal, cart.ebtEligibleTotal) && Intrinsics.e(this.ebtNonEligibleTotal, cart.ebtNonEligibleTotal) && Intrinsics.e(this.ebtSurchargePrice, cart.ebtSurchargePrice) && Intrinsics.e(this.ebtSuggestedTotal, cart.ebtSuggestedTotal);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        CartModifications cartModifications = this.outOfStockModifications;
        int iHashCode2 = (((((iHashCode + (cartModifications == null ? 0 : cartModifications.hashCode())) * 31) + this.entries.hashCode()) * 31) + Boolean.hashCode(this.calculated)) * 31;
        CustomerDataResponse customerDataResponse = this.customerData;
        int iHashCode3 = (((((iHashCode2 + (customerDataResponse == null ? 0 : customerDataResponse.hashCode())) * 31) + this.guid.hashCode()) * 31) + this.pointOfService.hashCode()) * 31;
        HybrisSubstitutePreference hybrisSubstitutePreference = this.substitutePreference;
        int iHashCode4 = (((((iHashCode3 + (hybrisSubstitutePreference == null ? 0 : hybrisSubstitutePreference.hashCode())) * 31) + this.depositPrice.hashCode()) * 31) + this.deliveryCost.hashCode()) * 31;
        HybrisDeliveryMode hybrisDeliveryMode = this.deliveryMode;
        int iHashCode5 = (((((iHashCode4 + (hybrisDeliveryMode == null ? 0 : hybrisDeliveryMode.hashCode())) * 31) + Integer.hashCode(this.deliveryItemsQuantity)) * 31) + this.deliveryOrderGroups.hashCode()) * 31;
        HybrisCustomerAddress hybrisCustomerAddress = this.deliveryAddress;
        int iHashCode6 = (((((((iHashCode5 + (hybrisCustomerAddress == null ? 0 : hybrisCustomerAddress.hashCode())) * 31) + Boolean.hashCode(this.earlyDelivery)) * 31) + Boolean.hashCode(this.deliveryAddressIsAlcoholEligible)) * 31) + Boolean.hashCode(this.earlyDeliveryAvailable)) * 31;
        HybrisPrice hybrisPrice = this.extendedDeliveryCost;
        int iHashCode7 = (((iHashCode6 + (hybrisPrice == null ? 0 : hybrisPrice.hashCode())) * 31) + Boolean.hashCode(this.editOrderWet)) * 31;
        String str = this.expirationTime;
        int iHashCode8 = (((((((iHashCode7 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.net)) * 31) + this.couponsSavings.hashCode()) * 31) + this.orderDiscounts.hashCode()) * 31;
        PaymentDetails paymentDetails = this.paymentInfo;
        int iHashCode9 = (iHashCode8 + (paymentDetails == null ? 0 : paymentDetails.hashCode())) * 31;
        MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse = this.multiTenderPaymentInfo;
        int iHashCode10 = (iHashCode9 + (multiTenderPaymentInfoResponse == null ? 0 : multiTenderPaymentInfoResponse.hashCode())) * 31;
        HybrisPickupPerson hybrisPickupPerson = this.pickUpPerson;
        int iHashCode11 = (iHashCode10 + (hybrisPickupPerson == null ? 0 : hybrisPickupPerson.hashCode())) * 31;
        HybrisPickupSlotInfo hybrisPickupSlotInfo = this.pickUpSlotInfo;
        int iHashCode12 = (((((((((iHashCode11 + (hybrisPickupSlotInfo == null ? 0 : hybrisPickupSlotInfo.hashCode())) * 31) + Integer.hashCode(this.pickupItemsQuantity)) * 31) + this.pickupOrderGroups.hashCode()) * 31) + Boolean.hashCode(this.phoneNumberTextable)) * 31) + this.productDiscounts.hashCode()) * 31;
        String str2 = this.purchaseOrderNumber;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.saveTime;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HybrisPrincipal hybrisPrincipal = this.savedBy;
        int iHashCode15 = (((((((((((((((((((((((((((iHashCode14 + (hybrisPrincipal == null ? 0 : hybrisPrincipal.hashCode())) * 31) + this.site.hashCode()) * 31) + this.specialSavings.hashCode()) * 31) + this.store.hashCode()) * 31) + this.subTotal.hashCode()) * 31) + Boolean.hashCode(this.tippedAndRated)) * 31) + this.teamMemberSavings.hashCode()) * 31) + this.mperksSavings.hashCode()) * 31) + this.totalDiscounts.hashCode()) * 31) + Integer.hashCode(this.totalItems)) * 31) + this.itemsTotal.hashCode()) * 31) + this.totalCosts.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.totalPriceWithTax.hashCode()) * 31;
        HybrisPrice hybrisPrice2 = this.creditTransactionAmount;
        int iHashCode16 = (((((((iHashCode15 + (hybrisPrice2 == null ? 0 : hybrisPrice2.hashCode())) * 31) + this.totalSavings.hashCode()) * 31) + this.totalTax.hashCode()) * 31) + Integer.hashCode(this.totalUnitCount)) * 31;
        HybrisPrincipal hybrisPrincipal2 = this.user;
        int iHashCode17 = (((iHashCode16 + (hybrisPrincipal2 == null ? 0 : hybrisPrincipal2.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str4 = this.originalOrderId;
        int iHashCode18 = (((iHashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.highValuePromos.hashCode()) * 31;
        String str5 = this.fulfillmentEligibility;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.partnerEligibility;
        return ((((((((((iHashCode19 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.availableFulfillmentEligibilities.hashCode()) * 31) + this.ebtEligibleTotal.hashCode()) * 31) + this.ebtNonEligibleTotal.hashCode()) * 31) + this.ebtSurchargePrice.hashCode()) * 31) + this.ebtSuggestedTotal.hashCode();
    }

    public String toString() {
        return "Cart(code=" + this.code + ", outOfStockModifications=" + this.outOfStockModifications + ", entries=" + this.entries + ", calculated=" + this.calculated + ", customerData=" + this.customerData + ", guid=" + this.guid + ", pointOfService=" + this.pointOfService + ", substitutePreference=" + this.substitutePreference + ", depositPrice=" + this.depositPrice + ", deliveryCost=" + this.deliveryCost + ", deliveryMode=" + this.deliveryMode + ", deliveryItemsQuantity=" + this.deliveryItemsQuantity + ", deliveryOrderGroups=" + this.deliveryOrderGroups + ", deliveryAddress=" + this.deliveryAddress + ", earlyDelivery=" + this.earlyDelivery + ", deliveryAddressIsAlcoholEligible=" + this.deliveryAddressIsAlcoholEligible + ", earlyDeliveryAvailable=" + this.earlyDeliveryAvailable + ", extendedDeliveryCost=" + this.extendedDeliveryCost + ", editOrderWet=" + this.editOrderWet + ", expirationTime=" + this.expirationTime + ", net=" + this.net + ", couponsSavings=" + this.couponsSavings + ", orderDiscounts=" + this.orderDiscounts + ", paymentInfo=" + this.paymentInfo + ", multiTenderPaymentInfo=" + this.multiTenderPaymentInfo + ", pickUpPerson=" + this.pickUpPerson + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", pickupItemsQuantity=" + this.pickupItemsQuantity + ", pickupOrderGroups=" + this.pickupOrderGroups + ", phoneNumberTextable=" + this.phoneNumberTextable + ", productDiscounts=" + this.productDiscounts + ", purchaseOrderNumber=" + this.purchaseOrderNumber + ", saveTime=" + this.saveTime + ", savedBy=" + this.savedBy + ", site=" + this.site + ", specialSavings=" + this.specialSavings + ", store=" + this.store + ", subTotal=" + this.subTotal + ", tippedAndRated=" + this.tippedAndRated + ", teamMemberSavings=" + this.teamMemberSavings + ", mperksSavings=" + this.mperksSavings + ", totalDiscounts=" + this.totalDiscounts + ", totalItems=" + this.totalItems + ", itemsTotal=" + this.itemsTotal + ", totalCosts=" + this.totalCosts + ", totalPrice=" + this.totalPrice + ", totalPriceWithTax=" + this.totalPriceWithTax + ", creditTransactionAmount=" + this.creditTransactionAmount + ", totalSavings=" + this.totalSavings + ", totalTax=" + this.totalTax + ", totalUnitCount=" + this.totalUnitCount + ", user=" + this.user + ", type=" + this.type + ", originalOrderId=" + this.originalOrderId + ", highValuePromos=" + this.highValuePromos + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ", partnerEligibility=" + this.partnerEligibility + ", availableFulfillmentEligibilities=" + this.availableFulfillmentEligibilities + ", ebtEligibleTotal=" + this.ebtEligibleTotal + ", ebtNonEligibleTotal=" + this.ebtNonEligibleTotal + ", ebtSurchargePrice=" + this.ebtSurchargePrice + ", ebtSuggestedTotal=" + this.ebtSuggestedTotal + ')';
    }

    public final List<HighValuePromo> A() {
        return this.highValuePromos;
    }

    /* renamed from: B, reason: from getter */
    public final HybrisPrice getItemsTotal() {
        return this.itemsTotal;
    }

    /* renamed from: C, reason: from getter */
    public final HybrisSavings getMperksSavings() {
        return this.mperksSavings;
    }

    /* renamed from: D, reason: from getter */
    public final MultiTenderPaymentInfoResponse getMultiTenderPaymentInfo() {
        return this.multiTenderPaymentInfo;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getNet() {
        return this.net;
    }

    /* renamed from: F, reason: from getter */
    public final HybrisPrice getOrderDiscounts() {
        return this.orderDiscounts;
    }

    /* renamed from: G, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    /* renamed from: H, reason: from getter */
    public final CartModifications getOutOfStockModifications() {
        return this.outOfStockModifications;
    }

    /* renamed from: I, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: J, reason: from getter */
    public final PaymentDetails getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: K, reason: from getter */
    public final boolean getPhoneNumberTextable() {
        return this.phoneNumberTextable;
    }

    /* renamed from: L, reason: from getter */
    public final HybrisPickupPerson getPickUpPerson() {
        return this.pickUpPerson;
    }

    /* renamed from: M, reason: from getter */
    public final HybrisPickupSlotInfo getPickUpSlotInfo() {
        return this.pickUpSlotInfo;
    }

    /* renamed from: N, reason: from getter */
    public final int getPickupItemsQuantity() {
        return this.pickupItemsQuantity;
    }

    public final List<PickupOrderGroup> O() {
        return this.pickupOrderGroups;
    }

    /* renamed from: P, reason: from getter */
    public final HybrisPointOfService getPointOfService() {
        return this.pointOfService;
    }

    /* renamed from: Q, reason: from getter */
    public final HybrisPrice getProductDiscounts() {
        return this.productDiscounts;
    }

    /* renamed from: R, reason: from getter */
    public final String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /* renamed from: S, reason: from getter */
    public final String getSaveTime() {
        return this.saveTime;
    }

    /* renamed from: T, reason: from getter */
    public final HybrisPrincipal getSavedBy() {
        return this.savedBy;
    }

    /* renamed from: U, reason: from getter */
    public final String getSite() {
        return this.site;
    }

    /* renamed from: V, reason: from getter */
    public final HybrisSavings getSpecialSavings() {
        return this.specialSavings;
    }

    /* renamed from: W, reason: from getter */
    public final String getStore() {
        return this.store;
    }

    /* renamed from: X, reason: from getter */
    public final HybrisPrice getSubTotal() {
        return this.subTotal;
    }

    /* renamed from: Y, reason: from getter */
    public final HybrisSubstitutePreference getSubstitutePreference() {
        return this.substitutePreference;
    }

    /* renamed from: Z, reason: from getter */
    public final HybrisSavings getTeamMemberSavings() {
        return this.teamMemberSavings;
    }

    /* renamed from: a0, reason: from getter */
    public final boolean getTippedAndRated() {
        return this.tippedAndRated;
    }

    public final List<FulfillmentEligibility> b() {
        return this.availableFulfillmentEligibilities;
    }

    /* renamed from: b0, reason: from getter */
    public final HybrisPrice getTotalCosts() {
        return this.totalCosts;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCalculated() {
        return this.calculated;
    }

    /* renamed from: c0, reason: from getter */
    public final HybrisPrice getTotalDiscounts() {
        return this.totalDiscounts;
    }

    /* renamed from: d, reason: from getter */
    public final HybrisSavings getCouponsSavings() {
        return this.couponsSavings;
    }

    /* renamed from: d0, reason: from getter */
    public final int getTotalItems() {
        return this.totalItems;
    }

    /* renamed from: e, reason: from getter */
    public final HybrisPrice getCreditTransactionAmount() {
        return this.creditTransactionAmount;
    }

    /* renamed from: e0, reason: from getter */
    public final HybrisPrice getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: f, reason: from getter */
    public final CustomerDataResponse getCustomerData() {
        return this.customerData;
    }

    /* renamed from: f0, reason: from getter */
    public final HybrisPrice getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    /* renamed from: g, reason: from getter */
    public final HybrisCustomerAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: g0, reason: from getter */
    public final HybrisSavings getTotalSavings() {
        return this.totalSavings;
    }

    @Override // ej.InterfaceC13678f
    public String getCode() {
        return this.code;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getDeliveryAddressIsAlcoholEligible() {
        return this.deliveryAddressIsAlcoholEligible;
    }

    /* renamed from: h0, reason: from getter */
    public final HybrisPrice getTotalTax() {
        return this.totalTax;
    }

    /* renamed from: i, reason: from getter */
    public final HybrisPrice getDeliveryCost() {
        return this.deliveryCost;
    }

    /* renamed from: i0, reason: from getter */
    public final int getTotalUnitCount() {
        return this.totalUnitCount;
    }

    /* renamed from: j, reason: from getter */
    public final int getDeliveryItemsQuantity() {
        return this.deliveryItemsQuantity;
    }

    /* renamed from: j0, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: k, reason: from getter */
    public final HybrisDeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: k0, reason: from getter */
    public final HybrisPrincipal getUser() {
        return this.user;
    }

    public final List<DeliveryOrderGroup> l() {
        return this.deliveryOrderGroups;
    }

    /* renamed from: m, reason: from getter */
    public final HybrisPrice getDepositPrice() {
        return this.depositPrice;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getEarlyDeliveryAvailable() {
        return this.earlyDeliveryAvailable;
    }

    /* renamed from: p, reason: from getter */
    public final HybrisPrice getEbtEligibleTotal() {
        return this.ebtEligibleTotal;
    }

    /* renamed from: q, reason: from getter */
    public final HybrisPrice getEbtNonEligibleTotal() {
        return this.ebtNonEligibleTotal;
    }

    /* renamed from: r, reason: from getter */
    public final HybrisPrice getEbtSuggestedTotal() {
        return this.ebtSuggestedTotal;
    }

    /* renamed from: s, reason: from getter */
    public final HybrisPrice getEbtSurchargePrice() {
        return this.ebtSurchargePrice;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getEditOrderWet() {
        return this.editOrderWet;
    }

    @Override // ej.InterfaceC13678f
    public int u() {
        return this.pointOfService.getStoreId();
    }

    public final List<EntryJson> v() {
        return this.entries;
    }

    /* renamed from: w, reason: from getter */
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    /* renamed from: x, reason: from getter */
    public final HybrisPrice getExtendedDeliveryCost() {
        return this.extendedDeliveryCost;
    }

    /* renamed from: y, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: z, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    public /* synthetic */ Cart(String str, CartModifications cartModifications, List list, boolean z10, CustomerDataResponse customerDataResponse, String str2, HybrisPointOfService hybrisPointOfService, HybrisSubstitutePreference hybrisSubstitutePreference, HybrisPrice hybrisPrice, HybrisPrice hybrisPrice2, HybrisDeliveryMode hybrisDeliveryMode, int i10, List list2, HybrisCustomerAddress hybrisCustomerAddress, boolean z11, boolean z12, boolean z13, HybrisPrice hybrisPrice3, boolean z14, String str3, boolean z15, HybrisSavings hybrisSavings, HybrisPrice hybrisPrice4, PaymentDetails paymentDetails, MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse, HybrisPickupPerson hybrisPickupPerson, HybrisPickupSlotInfo hybrisPickupSlotInfo, int i11, List list3, boolean z16, HybrisPrice hybrisPrice5, String str4, String str5, HybrisPrincipal hybrisPrincipal, String str6, HybrisSavings hybrisSavings2, String str7, HybrisPrice hybrisPrice6, boolean z17, HybrisSavings hybrisSavings3, HybrisSavings hybrisSavings4, HybrisPrice hybrisPrice7, int i12, HybrisPrice hybrisPrice8, HybrisPrice hybrisPrice9, HybrisPrice hybrisPrice10, HybrisPrice hybrisPrice11, HybrisPrice hybrisPrice12, HybrisSavings hybrisSavings5, HybrisPrice hybrisPrice13, int i13, HybrisPrincipal hybrisPrincipal2, String str8, String str9, List list4, String str10, String str11, List list5, HybrisPrice hybrisPrice14, HybrisPrice hybrisPrice15, HybrisPrice hybrisPrice16, HybrisPrice hybrisPrice17, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "-1" : str, (i14 & 2) != 0 ? null : cartModifications, (i14 & 4) != 0 ? CollectionsKt.m() : list, (i14 & 8) != 0 ? false : z10, (i14 & 16) != 0 ? null : customerDataResponse, (i14 & 32) != 0 ? "" : str2, hybrisPointOfService, (i14 & 128) != 0 ? null : hybrisSubstitutePreference, (i14 & 256) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice, (i14 & 512) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice2, (i14 & 1024) != 0 ? null : hybrisDeliveryMode, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : i10, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? CollectionsKt.m() : list2, (i14 & 8192) != 0 ? null : hybrisCustomerAddress, (i14 & 16384) != 0 ? false : z11, (i14 & 32768) != 0 ? false : z12, (i14 & 65536) != 0 ? false : z13, (i14 & 131072) != 0 ? null : hybrisPrice3, (i14 & 262144) != 0 ? false : z14, (i14 & 524288) != 0 ? null : str3, (i14 & 1048576) != 0 ? false : z15, (i14 & 2097152) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings, (i14 & 4194304) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice4, (i14 & 8388608) != 0 ? null : paymentDetails, (i14 & 16777216) != 0 ? null : multiTenderPaymentInfoResponse, (i14 & 33554432) != 0 ? null : hybrisPickupPerson, (i14 & 67108864) != 0 ? null : hybrisPickupSlotInfo, (i14 & 134217728) != 0 ? 0 : i11, (i14 & 268435456) != 0 ? CollectionsKt.m() : list3, (i14 & 536870912) != 0 ? false : z16, (i14 & 1073741824) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice5, (i14 & Integer.MIN_VALUE) != 0 ? null : str4, (i15 & 1) != 0 ? null : str5, (i15 & 2) != 0 ? null : hybrisPrincipal, (i15 & 4) != 0 ? BuildConfig.FLIPP_MERCHANT_ID : str6, (i15 & 8) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings2, (i15 & 16) != 0 ? BuildConfig.FLIPP_MERCHANT_ID : str7, (i15 & 32) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice6, (i15 & 64) != 0 ? false : z17, (i15 & 128) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings3, (i15 & 256) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings4, (i15 & 512) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice7, (i15 & 1024) != 0 ? 0 : i12, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice8, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice9, (i15 & 8192) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice10, (i15 & 16384) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice11, (i15 & 32768) != 0 ? null : hybrisPrice12, (i15 & 65536) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings5, (i15 & 131072) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice13, (i15 & 262144) != 0 ? 0 : i13, (i15 & 524288) != 0 ? null : hybrisPrincipal2, (i15 & 1048576) != 0 ? "cartWsDTO" : str8, (2097152 & i15) != 0 ? null : str9, (4194304 & i15) != 0 ? CollectionsKt.m() : list4, (8388608 & i15) != 0 ? null : str10, (16777216 & i15) != 0 ? null : str11, (33554432 & i15) != 0 ? CollectionsKt.m() : list5, (67108864 & i15) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice14, (134217728 & i15) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice15, (268435456 & i15) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice16, (536870912 & i15) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice17);
    }
}
