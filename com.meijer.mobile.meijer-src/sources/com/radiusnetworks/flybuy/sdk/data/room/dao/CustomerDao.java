package com.radiusnetworks.flybuy.sdk.data.room.dao;

import androidx.view.AbstractC6127A;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/dao/CustomerDao;", "", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "currentUser", "()Ljava/util/List;", "customer", "", "insert", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;)V", "deleteAll", "()V", "Landroidx/lifecycle/A;", "getAll", "()Landroidx/lifecycle/A;", "all", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CustomerDao {
    List<Customer> currentUser();

    void deleteAll();

    AbstractC6127A<List<Customer>> getAll();

    void insert(Customer customer);
}
