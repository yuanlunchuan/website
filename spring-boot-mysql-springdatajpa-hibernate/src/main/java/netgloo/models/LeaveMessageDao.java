package netgloo.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface LeaveMessageDao extends CrudRepository<LeaveMessage, Long> {

}
