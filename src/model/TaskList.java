package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class TaskList implements Serializable {
	
	/**
	 * Serial version UID to identify this object for serialization.
	 */
	private static final long serialVersionUID = -8513246459933416900L;
	private ArrayList<Task> taskList;
	
	
	/**
	 * Constructor for the class. Creates an empty task list.
	 */
	public TaskList() {
		
		taskList = new ArrayList<Task>();
	}
	
	
	/**
	 * Returns the list of tasks as an ArrayList.
	 * @return the list of tasks as an ArrayList.
	 */
	public ArrayList<Task> getTaskList() {

		return taskList;
	}
	
	
	/**
	 * Adds the given task to the taskList.
	 * @param task the Task object to be added to the taskList.
	 */
	public void addTask(Task task) {

		taskList.add(task);
	}
	
	
	/**
	 * Removes the given task from the taskList. If that task does not exist, does nothing.
	 * @param task the task to be removed
	 * @return true if removed successfully and list is changed, false otherwise.
	 */
	public boolean removeTask(Task task) {
		
		if (taskList.remove(task)) return true;
		return false;
	}
	
	/**
	 * Removes from the taskList the task given by the date it was created.
	 * Removes from the taskList the task given by the date it was created (which should
	 * be unique for each task). If such a task exists, it is returned after being removed;
	 * otherwise, taskList is unchanged and null is returned.
	 * @param dateCreated the dateCreated of the task to be removed.
	 * @return the Task deleted if list is changed; otherwise, null.
	 */
	public Task removeTask(Date dateCreated) {
		
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getDateCreated().equals(dateCreated)) {
				return taskList.remove(i);
			}
		}
		return null;
	}
	
	
	/**
	 * Gets from the task list the task given by the date it was created.
	 * Gets from the task list the task given by the date it was created (which should
	 * be unique for each task). If such a task exists, it is returned. Otherwise, null is returned.
	 * @param dateCreated the dateCreated of the task to be removed.
	 * @return the Task if found; otherwise, null.
	 */
	public Task getTask(Date dateCreated) {

		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getDateCreated().equals(dateCreated)) {
				return taskList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Modifies a task given the task to be modified and all of its new values.
	 * Modifies a task given the task to be modified and all of its new values; values 
	 * that should be kept the same should be passed in as the old value.
	 * @param task the task to be modified.
	 * @param taskName the new name of the task.
	 * @param description the new description of the task.
	 * @param priority the new priority of the task.
	 * @param category the new category of the task.
	 * @param completed the new completedness of the task.
	 * @param dateDue the new due date of the task.
	 * @param location the new location of the task.
	 */
	public void modifyTask(Task task, String taskName, String description, int priority, String category,
			boolean completed, Date dateDue, String location) {
		
		task.setName(taskName);
		task.setDescription(description);
		task.setPriority(priority);
		task.setCategory(category);
		task.setCompleted(completed);
		task.setDateDue(dateDue);
		task.setLocation(location);
	}

	
//USELESS METHODS
//	
//	/**
//	 * Gets the task at given index - useful for iterating over TaskList.
//	 * @param index the index at which to grab the task.
//	 * @return the Task at the given index.
//	 * @throws IndexOutOfBoundsException if index not valid for the number of tasks.
//	 */
//	public Task getTask(int index) {
//		
//		if (index < taskList.size() && index >= 0) {
//			return taskList.get(index);
//		}
//		throw new IndexOutOfBoundsException();
//		
//	}
//	
//	
//	/**
//	 * Returns the number of tasks in the task list.
//	 * @return the number of tasks in the tas list.
//	 */
//	public int size() {
//		return taskList.size();
//	}
//	
//	
//	/**
//	 * Modifies a task given the dateCreated of the task and all of its new values.
//	 * Modifies a task given the task to be modified and all of its new values; values 
//	 * that should be kept the same should be passed in as the old value.
//	 * @param dateCreated the dateCreated of the task to be modified.
//	 * @param taskName the new name of the task.
//	 * @param description the new description of the task.
//	 * @param priority the new priority of the task.
//	 * @param category the new category of the task.
//	 * @param completed the new completedness of the task.
//	 * @param dateDue the new due date of the task.
//	 * @param location the new location of the task.
//	 */
//	public void modifyTask(Date dateCreated, String taskName, String description, int priority, String category,
//			boolean completed, Date dateDue, String location) {
//		
//		Task task = getTask(dateCreated);
//		modifyTask(task, taskName, description, priority, category, completed, dateDue, location);
//	}
	


}