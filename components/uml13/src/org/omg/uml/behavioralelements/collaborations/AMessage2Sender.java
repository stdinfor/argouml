package org.omg.uml.behavioralelements.collaborations;

/**
 * A_message2_sender association proxy interface.
 */
public interface AMessage2Sender extends javax.jmi.reflect.RefAssociation {
    /**
     * Queries whether a link currently exists between a given pair of instance 
     * objects in the associations link set.
     * @param message2 Value of the first association end.
     * @param sender Value of the second association end.
     * @return Returns true if the queried link exists.
     */
    public boolean exists(org.omg.uml.behavioralelements.collaborations.Message message2, org.omg.uml.behavioralelements.collaborations.ClassifierRole sender);
    /**
     * Queries the instance objects that are related to a particular instance 
     * object by a link in the current associations link set.
     * @param message2 Required value of the first association end.
     * @return Collection of related objects.
     */
    public java.util.Collection getMessage2(org.omg.uml.behavioralelements.collaborations.ClassifierRole sender);
    /**
     * Queries the instance object that is related to a particular instance object 
     * by a link in the current associations link set.
     * @param sender Required value of the second association end.
     * @return Related object or <code>null</code> if none exists.
     */
    public org.omg.uml.behavioralelements.collaborations.ClassifierRole getSender(org.omg.uml.behavioralelements.collaborations.Message message2);
    /**
     * Creates a link between the pair of instance objects in the associations 
     * link set.
     * @param message2 Value of the first association end.
     * @param sender Value of the second association end.
     */
    public boolean add(org.omg.uml.behavioralelements.collaborations.Message message2, org.omg.uml.behavioralelements.collaborations.ClassifierRole sender);
    /**
     * Removes a link between a pair of instance objects in the current associations 
     * link set.
     * @param message2 Value of the first association end.
     * @param sender Value of the second association end.
     */
    public boolean remove(org.omg.uml.behavioralelements.collaborations.Message message2, org.omg.uml.behavioralelements.collaborations.ClassifierRole sender);
}
